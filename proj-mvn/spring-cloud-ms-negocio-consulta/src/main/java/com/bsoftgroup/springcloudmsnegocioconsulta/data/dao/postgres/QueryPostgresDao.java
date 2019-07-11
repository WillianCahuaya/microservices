package com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.postgres;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.connection.ConnectionDB;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.QueryDao;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.querysql.Sql;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.querysql.TableField;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ClientModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ProductModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;

public class QueryPostgresDao implements QueryDao {

	@Override
	public List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException {

		List<ServiceModel> services = new ArrayList();
		ConnectionDB connDB = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connDB = new ConnectionDB();
		} catch (Exception e) {
			throw new AppException(e.getMessage());
		}

		StringBuilder sbSQL = new StringBuilder();
		sbSQL.append(Sql.SELECT);
		sbSQL.append(TableField.Client.COL_CLIENTID).append(Sql.SEP);
		sbSQL.append(TableField.Client.COL_FULLNAME).append(Sql.SEP);
		sbSQL.append(TableField.Product.COL_PRODUCTID).append(Sql.SEP);
		sbSQL.append(TableField.Product.COL_DESCRIPTION).append(Sql.SEP);
		sbSQL.append(TableField.Product.COL_PRICE).append(Sql.SEP);
		sbSQL.append(TableField.ClientProduct.COL_CLIENTPRODUCTID).append(Sql.SEP);
		sbSQL.append(TableField.ClientProduct.COL_AMOUNT).append(Sql.SEP);
		sbSQL.append(TableField.ClientProduct.COL_STATUS).append(Sql.SEP);
		sbSQL.append(Sql.FROM).append(TableField.CLIENT);
		sbSQL.append(Sql.INNER_JOIN).append(TableField.CLIENT_PRODUCT);
		sbSQL.append(Sql.ON).append(TableField.Client.PRE_CLIENTID).append(Sql.EQU).append(TableField.ClientProduct.CLIENTID);
		sbSQL.append(Sql.INNER_JOIN).append(TableField.PRODUCT);
		sbSQL.append(Sql.ON).append(TableField.Product.PRE_PRODUCTID).append(Sql.EQU).append(TableField.ClientProduct.PRODUCTID);
		sbSQL.append(Sql.AND).append(TableField.Client.PRE_CLIENTID).append(Sql.EQU).append(Sql.PARAM);
		sbSQL.append(Sql.AND).append(TableField.Client.PRE_COMPANYID).append(Sql.EQU).append(Sql.PARAM);
		System.out.println(sbSQL);
		try {
			connDB.getConexion().setAutoCommit(false);
			pstmt = connDB.getConexion().prepareStatement(sbSQL.toString());
			pstmt.setInt(1, clientId);
			pstmt.setInt(2, companyId);
			rs = pstmt.executeQuery();

			connDB.getConexion().commit();
			while (rs.next()) {
				ServiceModel service = new ServiceModel();
				service.setId(rs.getInt(TableField.ClientProduct.AS_CLIENTPRODUCT));
				service.setStatus(rs.getString(TableField.ClientProduct.AS_STATUS));
				service.setClient(new ClientModel(rs.getInt(TableField.Client.AS_CLIENT), rs.getString(TableField.Client.AS_FULLNAME)));
				service.setProduct(new ProductModel(rs.getInt(TableField.Product.AS_PRODUCT), rs.getString(TableField.Product.AS_DESCRIPTION)));
				service.setAmount(rs.getInt(TableField.ClientProduct.AS_AMOUNT));
				services.add(service);
			}
		} catch (Exception e) {
			throw new AppException(e.getMessage());
		} finally {
			try {
				connDB.closeResources(connDB.getConexion(), rs, null, null, pstmt);
			} catch (Exception e) {// TODO Auto-generated catch block e.printStackTrace();}
			}
			return services;
		}
	}
}
