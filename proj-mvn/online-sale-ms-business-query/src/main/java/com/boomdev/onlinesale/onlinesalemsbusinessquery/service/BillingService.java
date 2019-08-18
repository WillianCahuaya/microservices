package com.boomdev.onlinesale.onlinesalemsbusinessquery.service;

import com.boomdev.onlinesale.onlinesalebeanbusiness.model.ServiceModel;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;

import java.util.List;

public interface BillingService {

    List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException;

}
