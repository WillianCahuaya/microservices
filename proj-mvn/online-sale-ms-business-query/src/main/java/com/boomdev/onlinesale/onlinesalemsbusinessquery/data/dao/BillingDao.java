package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.dao;

import com.boomdev.onlinesale.onlinesalebeanbusiness.model.ServiceModel;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;

import java.util.List;

public interface BillingDao {

	List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException;
	
}
