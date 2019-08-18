package com.boomdev.onlinesale.onlinesalemsbusquery.client.feign;

import com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business.ServiceDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


//@FeignClient(name="appname-ms-businessquery", url="localhost:8081")
//@FeignClient(name="appname-ms-businessquery")
@FeignClient(name="appname-ms-apigateway")
@RibbonClient(name="appname-ms-businessquery")
public interface BillingFeignClient {

	@GetMapping(path="/appname-ms-businessquery/ctxpath-ms-businessquery/billing/clients/{clientId}/companies/{companyId}")
	List<ServiceDto> getServices(
            @PathVariable("clientId") Integer clientId,
            @PathVariable("companyId") Integer companyId);
	
}
