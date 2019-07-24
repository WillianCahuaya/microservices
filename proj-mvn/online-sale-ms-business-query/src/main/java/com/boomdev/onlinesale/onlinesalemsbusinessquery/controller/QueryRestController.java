package com.boomdev.onlinesale.onlinesalemsbusinessquery.controller;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ServiceDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.mapper.ServiceMapper;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.QueryService;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QueryRestController {

    @Autowired
    private QueryService queryService;

    @Autowired
    private ServiceMapper serviceMapper;

    @GetMapping(path = "/billing/clients/{clientId}/companies/{companyId}")
    public List<ServiceDto> getServices(@PathVariable("clientId") Integer clientId,
                                        @PathVariable("companyId") Integer companyId) {
        try {
            List<ServiceModel> serviceModels = queryService.getServices(clientId, companyId);
            return serviceMapper.toDto(serviceModels);
        } catch (AppException e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }
}