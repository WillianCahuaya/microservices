package com.boomdev.onlinesale.onlinesalemsmanagement.client;

import com.boomdev.onlinesale.onlinesalebeanbusiness.entity.configuration.ConnectionEntity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class ConfigurationDataSource{

    private ConnectionEntity connection;

    public ConfigurationDataSource() {
    }

    public ConnectionEntity getConnection() {
        return connection;
    }

    public void setConnection(ConnectionEntity connection) {
        this.connection = connection;
    }
}
