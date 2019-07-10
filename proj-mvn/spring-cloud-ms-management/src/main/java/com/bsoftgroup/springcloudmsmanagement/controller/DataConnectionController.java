package com.bsoftgroup.springcloudmsmanagement.controller;

import com.bsoftgroup.springcloudmsmanagement.configuration.ConfigurationDataSource;
import com.bsoftgroup.springcloudmsmanagement.mapper.DataConnectionMapper;
import com.bsoftgroup.springcloudmsmanagement.model.DataConnectionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DataConnectionController {

    @Autowired
    private ConfigurationDataSource service;

    @Autowired
    private DataConnectionMapper dataConnection;

    @GetMapping("dataconnectionmain")
    public DataConnectionModel getDataConnectionMain() {
        return dataConnection.toModel(service.getConnection().getPostgres().getMain());
    }

    @GetMapping("dataconnectionreport")
    public DataConnectionModel getDataConnectionReport() {
        return dataConnection.toModel(service.getConnection().getPostgres().getReport());
    }
}
