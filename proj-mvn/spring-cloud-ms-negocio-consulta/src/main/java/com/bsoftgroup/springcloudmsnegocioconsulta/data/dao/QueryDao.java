package com.bsoftgroup.springcloudmsnegocioconsulta.data.dao;

import java.util.List;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;

public interface QueryDao {

	List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException;
	
}
