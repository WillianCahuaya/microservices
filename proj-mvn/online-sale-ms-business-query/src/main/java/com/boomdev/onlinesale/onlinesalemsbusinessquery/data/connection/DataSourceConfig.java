package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    public static final String URL_CONN = "http://localhost:8084/ctxpath-ms-management/dataconnectionmain";

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        DataConnectionEntity dataConnection = getDataConnectionEntity();
        dataSource.setDriverClassName(dataConnection.getDriverclassname());
        dataSource.setUrl(dataConnection.getUrl());
        dataSource.setUsername(dataConnection.getUsername());
        dataSource.setPassword(dataConnection.getPassword());
        return dataSource;
    }

    private DataConnectionEntity getDataConnectionEntity() {
        ResponseEntity<DataConnectionEntity> responseEntity = new RestTemplate().getForEntity(URL_CONN, DataConnectionEntity.class);
        return responseEntity.getBody();
    }

}
