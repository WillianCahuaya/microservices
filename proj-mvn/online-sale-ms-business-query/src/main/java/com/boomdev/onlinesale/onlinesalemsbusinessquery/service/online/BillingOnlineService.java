package com.boomdev.onlinesale.onlinesalemsbusinessquery.service.online;

import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.dao.BillingDao;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.data.exception.AppException;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.BillingService;
import com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model.ServiceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingOnlineService implements BillingService {

	@Autowired
	private BillingDao billingDao;

	@Override
	public List<ServiceModel> getServices(Integer clientId, Integer companyId) throws AppException {
		return billingDao.getServices(clientId, companyId);
	}
}
