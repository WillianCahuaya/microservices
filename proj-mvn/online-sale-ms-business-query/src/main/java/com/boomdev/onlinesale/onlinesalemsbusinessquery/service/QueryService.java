package com.boomdev.onlinesale.onlinesalemsbusinessquery.service;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;

import java.util.List;

public interface QueryService {

    List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException;

}
