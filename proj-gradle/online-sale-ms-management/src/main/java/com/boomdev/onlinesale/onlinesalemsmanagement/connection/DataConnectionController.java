package com.boomdev.onlinesale.onlinesalemsmanagement.connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@CrossOrigin(origins = "http://localhost:8085", methods = {RequestMethod.GET, RequestMethod.POST})
public class DataConnectionController {

    @Autowired
    private ConfigurationDataSource service;

    @GetMapping("dataconnectionmain")
    public DataConnectionModel getDataConnectionMain() {
        return service.getConnection().getPostgres().getMain().getConnection();
    }

    @GetMapping("dataconnectionreport")
    public DataConnectionModel getDataConnectionReport() {
        return service.getConnection().getPostgres().getReport().getConnection();
    }
}
