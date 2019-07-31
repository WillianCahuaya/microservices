package com.boomdev.onlinesale.onlinesalemsbusquery.client;

import com.boomdev.onlinesale.onlinesalemsbusquery.client.dto.ServiceDto;

import java.util.List;

public interface BillingClient {

	List<ServiceDto> getServices(Integer clientId, Integer companyId);
}
