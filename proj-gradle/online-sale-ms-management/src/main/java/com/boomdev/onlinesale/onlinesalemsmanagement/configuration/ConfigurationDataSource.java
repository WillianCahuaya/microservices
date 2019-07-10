package com.boomdev.onlinesale.onlinesalemsmanagement.configuration;

import com.boomdev.onlinesale.onlinesalemsmanagement.entity.ConnectionEntity;
import com.boomdev.onlinesale.onlinesalemsmanagement.entity.DataSourceEntity;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class ConfigurationDataSource extends DataSourceEntity {

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
