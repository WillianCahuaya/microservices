package com.bsoftgroup.springcloudmsmanagement.conexion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataConexionController {

	@Autowired
	private ConfigurationDataSource service;

	@GetMapping("dataconexionpostgres")
	public DataConexion getDataConexionPostgres() {
		return service.getPostgres().getData();
	}
	
	@GetMapping("dataconexionmysql")
	public DataConexion getDataConexionMysql() {
		return service.getMysql().getData();
	}
}
