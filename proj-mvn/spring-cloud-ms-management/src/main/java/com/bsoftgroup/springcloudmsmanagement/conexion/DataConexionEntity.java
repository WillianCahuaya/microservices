package com.bsoftgroup.springcloudmsmanagement.conexion;

public class DataConexionEntity {
	
	private String driverclassname;
	private String url;
	private String username;
	private String password;
	
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
