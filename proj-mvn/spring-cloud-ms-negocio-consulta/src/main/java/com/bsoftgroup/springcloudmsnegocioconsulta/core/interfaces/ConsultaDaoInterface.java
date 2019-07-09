package com.bsoftgroup.springcloudmsnegocioconsulta.core.interfaces;

import java.util.List;

import com.bsoftgroup.springcloudmsnegocioconsulta.core.util.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.Servicio;

public interface ConsultaDaoInterface {

	public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException;
	
}
