package com.bsoftgroup.springcloudmsmanagement.conexion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("conexion")
public class ConfigurationDataSource {

	private String driverclassname;
	private String url;
	private String username;
	private String password;

	public ConfigurationDataSource() {
	}

	public DataConexion getData() {
		return new DataConexion(driverclassname, url, username, password);
	}

	public void setDriverclassname(String driverclassname) {
		this.driverclassname = driverclassname;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
