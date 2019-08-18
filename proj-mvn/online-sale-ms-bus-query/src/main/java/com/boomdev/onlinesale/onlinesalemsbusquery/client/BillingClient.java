package com.boomdev.onlinesale.onlinesalemsbusquery.client;

import com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business.ServiceDto;

import java.util.List;

public interface BillingClient {

	List<ServiceDto> getServices(Integer clientId, Integer companyId);
}
