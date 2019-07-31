package com.boomdev.onlinesale.onlinesalemsbusquery.controller;

import com.boomdev.onlinesale.onlinesalemsbusquery.client.BillingClient;
import com.boomdev.onlinesale.onlinesalemsbusquery.client.dto.ServiceDto;
import com.boomdev.onlinesale.onlinesalemsbusquery.client.feign.BillingFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingBusRestController {

	@Autowired
	private BillingClient billingClient;
	
	@Autowired
	private BillingFeignClient billingFeignClient;

	@GetMapping("/clients/{clientId}/companies/{companyId}")
	public List<ServiceDto> getServices(
	        @PathVariable("clientId")Integer clientId,
			@PathVariable("companyId") Integer companyId){
		return billingClient.getServices(clientId, companyId);
	}
	
	@GetMapping("/feign/clients/{clientId}/companies/{companyId}")
	public List<ServiceDto> getFeignServices(
	        @PathVariable("clientId")Integer clientId,
			@PathVariable("companyId") Integer companyId){
		return billingFeignClient.getServices(clientId, companyId);
	}
}