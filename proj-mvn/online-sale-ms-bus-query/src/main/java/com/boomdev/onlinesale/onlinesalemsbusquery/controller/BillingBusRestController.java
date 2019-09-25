package com.boomdev.onlinesale.onlinesalemsbusquery.controller;

import com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business.ClientDto;
import com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business.CompanyDto;
import com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business.ServiceDto;
import com.boomdev.onlinesale.onlinesalemsbusquery.client.BillingClient;
import com.boomdev.onlinesale.onlinesalemsbusquery.client.feign.BillingFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingBusRestController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Environment enviroment;

	@Autowired
	private BillingClient billingClient;
	
	@Autowired
	private BillingFeignClient billingFeignClient;

	@GetMapping("/clients/{clientId}/companies/{companyId}")
	public List<ServiceDto> getServices(
	        @PathVariable("clientId")Integer clientId,
			@PathVariable("companyId") Integer companyId){

		String port = enviroment.getProperty(("local.server.port"));
		logger.info("PROJECT-BUSQUERY-NATIVE: port={}, clientId={}, companyId={}", port, clientId, companyId);

		return billingClient.getServices(clientId, companyId);
	}
	
	@GetMapping("/feign/clients/{clientId}/companies/{companyId}")
	//@HystrixCommand(fallbackMethod="getHystrixService")
	public List<ServiceDto> getFeignServices(
	        @PathVariable("clientId")Integer clientId,
			@PathVariable("companyId") Integer companyId){

		String port = enviroment.getProperty(("local.server.port"));
		logger.info("PROJECT-BUSQUERY-FEIGN: si port={}, clientId={}, companyId={}", port, clientId, companyId);

		return billingFeignClient.getServices(clientId, companyId);
	}

	public List<ServiceDto> getHystrixService(
			@PathVariable("clientId")Integer clientId,
			@PathVariable("companyId") Integer companyId){

		String port = enviroment.getProperty(("local.server.port"));
		logger.info("PROJECT-BUSQUERY-Hystrix: port={}, clientId={}, companyId={}", port, clientId, companyId);

		List<ServiceDto> services = new ArrayList<>();
		ServiceDto service = new ServiceDto();
		service.setId(1);
		ClientDto client = new ClientDto();
		client.setId(1);
		client.setFullname("Willian Cahuaya");
		CompanyDto company = new CompanyDto();
		company.setId(1);
		company.setBusinessName("WIYOCARA.SAC");
		client.setCompany(company);
		service.setClient(client);
		services.add(service);
		return services;
	}
}