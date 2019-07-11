package com.bsoftgroup.springcloudmsnegocioconsulta.service.online;

import com.bsoftgroup.springcloudmsnegocioconsulta.data.dao.QueryDao;
import com.bsoftgroup.springcloudmsnegocioconsulta.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;

public class QueryOnlineService implements QueryService {

	@Autowired
	private QueryDao queryDao;
	
}
