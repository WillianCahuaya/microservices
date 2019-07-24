package com.boomdev.onlinesale.onlinesalemsbusinessquery.service.online;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.dao.QueryDao;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.QueryService;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryOnlineService implements QueryService {

	@Autowired
	private QueryDao queryDao;

	@Override
	public List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException {
		return queryDao.getServices(clientId, companyId);
	}
}
