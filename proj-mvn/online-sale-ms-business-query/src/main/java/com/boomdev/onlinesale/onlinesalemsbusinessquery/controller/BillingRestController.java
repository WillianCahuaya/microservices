package com.boomdev.onlinesale.onlinesalemsbusinessquery.controller;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.dto.ServiceDto;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.controller.mapper.ServiceMapper;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.BillingService;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingRestController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Environment enviroment;

    @Autowired
    private BillingService billingService;

    @Autowired
    private ServiceMapper serviceMapper;

    @GetMapping(path = "/clients/{clientId}/companies/{companyId}")
    public List<ServiceDto> getServices(
            @PathVariable("clientId") Integer clientId,
            @PathVariable("companyId") Integer companyId) {

        String port = enviroment.getProperty(("local.server.port"));
        logger.info("PROJECT-BUSINESSQUERY: port={}, clientId={}, companyId={}", port, clientId, companyId);

        try {
            List<ServiceModel> serviceModels = billingService.getServices(clientId, companyId);
            return serviceMapper.toDto(serviceModels);
        } catch (AppException e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }
}