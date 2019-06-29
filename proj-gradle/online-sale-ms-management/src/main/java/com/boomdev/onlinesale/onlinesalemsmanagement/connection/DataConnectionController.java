package com.boomdev.onlinesale.onlinesalemsmanagement.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataConnectionController {

    @Autowired
    ConfigurationDataSource service;

    @GetMapping("dataconnection")
    public DataConnectionModel getDataConnectionDB(){
        return service.getConfigDB();
    }
}
