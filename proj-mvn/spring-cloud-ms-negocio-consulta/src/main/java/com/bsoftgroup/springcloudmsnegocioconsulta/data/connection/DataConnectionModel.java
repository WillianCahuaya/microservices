package com.bsoftgroup.springcloudmsnegocioconsulta.data.connection;

public class DataConnectionModel {

	private String driverclassname;
	private String url;
	private String username;
	private String password;

	public DataConnectionModel() {
		this.url = "jdbc:postgresql://localhost:5432/postgres";
		this.driverclassname = "org.postgresql.Driver";
		this.username = "microservices";
		this.password = "123";
	}

	public DataConnectionModel(String driverclassname, String url, String username, String password) {
		this.driverclassname = driverclassname;
		this.url = url;
		this.username = username;
		this.password = password;
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