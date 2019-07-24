package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.dao;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;

import java.util.List;

public interface QueryDao {

	List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException;
	
}
