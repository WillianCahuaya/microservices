package com.bsoftgroup.springcloudmsnegocioconsulta.service;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;

import java.util.List;

public interface QueryService {

    List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException;

}
