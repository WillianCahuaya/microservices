package com.bsofgroup.springcloudmssecurity.util;

public class DataConexionEntity {

	private String driverclassname;
	private String url;
	private String username;
	private String password;

	public DataConexionEntity() {
		super();
	}

	public DataConexion getData() {
		return new DataConexion(driverclassname, url, username, password);
	}

	public String getDriverclassname() {
		return driverclassname;
	}

	public void setDriverclassname(String driverclassname) {
		this.driverclassname = driverclassname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
