package com.bsoftgroup.springcloudmsmanagement.conexion;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("conexiondb")
public class ConfigurationDataSource {

	private Postgres postgres;
	private Mysql mysql;

	public ConfigurationDataSource() {
	}

	public Postgres getPostgres() {
		return postgres;
	}

	public void setPostgres(Postgres postgres) {
		this.postgres = postgres;
	}

	public Mysql getMysql() {
		return mysql;
	}

	public void setMysql(Mysql mysql) {
		this.mysql = mysql;
	}

	public static class Postgres extends DataConexionEntity {

	}

	public static class Mysql extends DataConexionEntity {

	}
}
