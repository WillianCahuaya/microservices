package com.bsoftgroup.springcloudmsnegocioconsulta.data.dao;

import java.util.List;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.ServiceModel;

public interface QueryDao {

	List<ServiceModel> getServices(Integer idClient, Integer idCompany) throws AppException;
	
}
