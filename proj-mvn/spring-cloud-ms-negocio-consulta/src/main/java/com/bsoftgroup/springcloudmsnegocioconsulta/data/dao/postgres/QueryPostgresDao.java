package com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.postgres;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.connection.ConnectionDB;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.QueryDao;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.ClientModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.ProductModel;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.ServiceModel;

public class QueryPostgresDao implements QueryDao {

	@Override
	public List<ServiceModel> getServices(Integer idClient, Integer idCompany) throws AppException {

		List<ServiceModel> services = new ArrayList();
		ConnectionDB connDB = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connDB = new ConnectionDB();
		} catch (Exception e) {
			throw new AppException(e.getMessage());
		}

		String SQL = "SELECT " +
				"c.codigo as cliente,  " +
				"c.nombres as nombres " +
				"p.codigo as producto, " +
				"p.descripcion as descripcion, " +
				"p.precio as precio, " +
				"cp.codigo as recibo, " +
				"cp.monto as deuda, " +
				"cp.estado as estado " +
				"FROM TBL_CLIENTE c " +
				"INNER JOIN TBL_CLIENTE_PRODUCTO cp ON c.codigo = cp.cliente " +
				"INNER JOIN TBL_PRODUCTO p ON p.codigo = cp.producto " +
				"AND c.codigo = ? and c.empresa = ? ";
		try {
			connDB.getConexion().setAutoCommit(false);
			pstmt = connDB.getConexion().prepareStatement(SQL);
			pstmt.setInt(1, idClient);
			pstmt.setInt(2, idCompany);
			rs = pstmt.executeQuery();

			connDB.getConexion().commit();
			while (rs.next()) {
				ServiceModel service = new ServiceModel();
				service.setCode(rs.getInt("recibo"));
				service.setStatus(rs.getString("estado"));
				service.setClient(new ClientModel(rs.getInt("cliente"), rs.getString("nombres")));
				service.setProduct(new ProductModel(rs.getInt("producto"), rs.getString("descripcion")));
				service.setAmount(rs.getInt("deuda"));
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
