package com.bsoftgroup.springcloudmsnegocioconsulta.Controller;

import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto.ServiceDto;
import com.bsoftgroup.springcloudmsnegocioconsulta.Controller.mapper.ServiceMapper;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.QueryService;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;
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

    @GetMapping(path = "/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
    public List<ServiceDto> getServices(@PathVariable("idCliente") Integer idClient,
                                        @PathVariable("idEmpresa") Integer idCompany) {
        try {
            List<ServiceModel> serviceModels = queryService.getServices(idClient, idCompany);
            return serviceMapper.toDto(serviceModels);
        } catch (AppException e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }
}