package com.boomdev.onlinesale.onlinesalemsmanagement.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DataConnectionController {

    @Autowired
    private ConfigurationDataSource service;

    @GetMapping("dataconnection")
    public DataConnectionModel getDataConnectionDB(){
        return service.getConfigDB();
    }
}
