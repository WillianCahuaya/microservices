package com.bsoftgroup.springcloudmsnegocioconsulta.data.connection;

import javax.sql.DataSource;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.connection.DataConnectionModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

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

//	@Bean(name = "entityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
//
//		JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//		Properties props = new Properties();
//		props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
//		props.setProperty("hibernate.show_sql", "true");
//		props.setProperty("hibernate.hbm2ddl.auto", "update");
//
//		factory.setJpaVendorAdapter(jpaVendorAdapter);
//		factory.setDataSource(dataSource());
//		factory.setJpaProperties(props);
////		factory.setPackagesToScan("br.com.ciaware.springmvc.ensaio.models");
//
//		return factory;
//	}

}
