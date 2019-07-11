package com.bsoftgroup.springcloudmsnegocioconsulta.data.connection;

import javax.sql.DataSource;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.connection.DataConnectionModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

	@Bean(name = "dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		DataConnectionModel dataConnectionModel = new DataConnectionModel();
		dataSource.setDriverClassName(dataConnectionModel.getDriverclassname());
		dataSource.setUrl(dataConnectionModel.getUrl());
		dataSource.setUsername(dataConnectionModel.getUsername());
		dataSource.setPassword(dataConnectionModel.getPassword());
		return dataSource;
	}

}
