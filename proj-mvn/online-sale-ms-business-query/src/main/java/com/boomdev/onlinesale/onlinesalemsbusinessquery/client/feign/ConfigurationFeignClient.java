package com.boomdev.onlinesale.onlinesalemsbusinessquery.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CONFIGURATION")
public interface ConfigurationFeignClient {

	@GetMapping(path="/ctxpath-ms-management/dataconnectionmain")
	Object getConfigurationMain();
	
}
