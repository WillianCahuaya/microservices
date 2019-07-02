package com.bsoftgroup.springbootpagolinea.core.negocio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.bsoftgroup.springbootpagolinea.core.interfaces.FacturacionDaoInterface;
import com.bsoftgroup.springbootpagolinea.core.interfaces.FacturacionServiceInterface;
import com.bsoftgroup.springbootpagolinea.core.negocio.bean.MailBean;
import com.bsoftgroup.springbootpagolinea.core.negocio.bean.Servicio;
import com.bsoftgroup.springbootpagolinea.core.util.AppException;
import com.bsoftgroup.springbootpagolinea.core.util.Transaccion;
import com.bsoftgroup.springbootpagolinea.core.util.Constantes;

@Service
public class FacturacionService implements FacturacionServiceInterface {
	
	@Autowired
	private FacturacionDaoInterface facturacionDao;
	
	public FacturacionService() {}

	@Override
	public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException {
		// TODO Auto-generated method stub
		return facturacionDao.getServicios(idCliente, idEmpresa);
	}

	@Override
	public Transaccion insertarServicio(Servicio servicio) throws AppException {
		// TODO Auto-generated method stub
		return	facturacionDao.insertarServicio(servicio);
		
	}

	@Override
	public Transaccion pagarServicio(Servicio servicio) throws AppException {
		// TODO Auto-generated method stub
		Transaccion tx  = facturacionDao.pagarServicio(servicio);
		MailBean email = new MailBean();
		if(tx.getCodigo().contains("000")) {
			email.setMessage("Pago se realizao conforme");
			email.setReceptor("falen2125@gmail.com");
			email.setSubject("administracion");
			MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
			headers.add("Content-Type", "application/json");
			HttpEntity<MailBean> request = new HttpEntity<MailBean>(email,headers);
			ResponseEntity<Void> response =  new RestTemplate().exchange(Constantes.URL_MAIL, HttpMethod.POST, request, Void.class);
		}
		
		return tx;
	}

	@Override
	public Transaccion deleteServicio(Servicio servicio) throws AppException {
		// TODO Auto-generated method stub
		return facturacionDao.deleteServicio(servicio);
	}

	@Override
	public Transaccion extornarServicio(Servicio servicio) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

}
