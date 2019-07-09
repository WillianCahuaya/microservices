package com.bsoftgroup.springcloudmsnegocioconsulta.core.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultaRestController {

	@Autowired
	private ConsultaServiceInterface consultaService;
	
}
