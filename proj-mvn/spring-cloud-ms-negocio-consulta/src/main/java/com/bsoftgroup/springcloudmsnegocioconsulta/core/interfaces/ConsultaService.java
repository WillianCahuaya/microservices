package com.bsoftgroup.springcloudmsnegocioconsulta.core.interfaces;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsultaService implements ConsultaServiceInterface {

	@Autowired
	private ConsultaDaoInterface consultaDao;
	
}
