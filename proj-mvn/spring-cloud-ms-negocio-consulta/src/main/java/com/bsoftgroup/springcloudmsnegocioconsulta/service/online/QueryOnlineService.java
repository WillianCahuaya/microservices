package com.bsoftgroup.springcloudmsnegocioconsulta.service.online;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.QueryDao;
import com.bsoftgroup.springcloudmsnegocioconsulta.data.exception.AppException;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.QueryService;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.model.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QueryOnlineService implements QueryService {

	@Autowired
	private QueryDao queryDao;

	@Override
	public List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException {
		return queryDao.getServices(clientId, companyId);
	}
}
