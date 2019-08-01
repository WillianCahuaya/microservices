package com.bsofgroup.springcloudmssecurity.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("conexiondb")
public class ConfigurationDataSource {

	private DataConexionEntity postgres;
	private DataConexionEntity mysql;

	public ConfigurationDataSource() {
	}

	public DataConexionEntity getPostgres() {
		return postgres;
	}

	public void setPostgres(DataConexionEntity postgres) {
		this.postgres = postgres;
	}

	public DataConexionEntity getMysql() {
		return mysql;
	}

	public void setMysql(DataConexionEntity mysql) {
		this.mysql = mysql;
	}

}
