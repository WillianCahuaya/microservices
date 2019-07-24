package com.boomdev.onlinesale.onlinesalemsbusquery.proxy;

import com.boomdev.onlinesale.onlinesalemsbusquery.dto.ServicioDto;
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
public class ConsultaBusServiceProxy implements ConsultaBusProxyInterface {

	private static String URL = "http://localhost:8081/msconsulta/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}";

	@Override
	public List<ServicioDto> getServicios(Integer idCliente, Integer idEmpresa) {
		List<ServicioDto> servicios = new ArrayList<ServicioDto>();
		Map<String, Integer> uriVariables = new HashMap<String, Integer>();
		uriVariables.put("idCliente", idCliente);
		uriVariables.put("idEmpresa", idEmpresa);
		
		ResponseEntity<List<ServicioDto>> responseEntity = new
				RestTemplate().exchange(URL, HttpMethod.GET,null,new
				ParameterizedTypeReference<List<ServicioDto>>(){}, uriVariables);
		
		if (responseEntity != null && responseEntity.hasBody()) {
			servicios = responseEntity.getBody();
		}
		return servicios;
	}
}
