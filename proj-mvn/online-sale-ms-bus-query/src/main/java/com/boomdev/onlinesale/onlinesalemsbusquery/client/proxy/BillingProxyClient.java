package com.boomdev.onlinesale.onlinesalemsbusquery.client.proxy;

import com.boomdev.onlinesale.onlinesalemsbusquery.client.BillingClient;
import com.boomdev.onlinesale.onlinesalemsbusquery.client.dto.ServiceDto;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BillingProxyClient implements BillingClient {

	private static String URL = "http://localhost:8081/ctxpath-ms-businessquery/billing/clients/{clientId}/companies/{companyId}";

	@Override
	public List<ServiceDto> getServices(Integer clientId, Integer companyId) {
		List<ServiceDto> services = new ArrayList<ServiceDto>();
		Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		uriVariables.put("clientId", clientId);
		uriVariables.put("companyId", companyId);
		
		ResponseEntity<List<ServiceDto>> responseEntity = new
				RestTemplate().exchange(URL, HttpMethod.GET,null,new
				ParameterizedTypeReference<List<ServiceDto>>(){}, uriVariables);
		
		if (responseEntity != null && responseEntity.hasBody()) {
			services = responseEntity.getBody();
		}
		return services;
	}
}
