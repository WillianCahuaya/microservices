package com.bsoftgroup.springcloudmsnegocioconsulta.Controller;

import com.bsoftgroup.springcloudmsnegocioconsulta.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryRestController {

	@Autowired
	private QueryService queryService;
	
}
