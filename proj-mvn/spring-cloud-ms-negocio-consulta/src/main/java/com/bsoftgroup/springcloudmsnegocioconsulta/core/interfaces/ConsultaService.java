package com.bsoftgroup.springcloudmsnegocioconsulta.core.interfaces;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.QueryDao;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultaService implements ConsultaServiceInterface {

	@Autowired
	private QueryDao consultaDao;
	
}
