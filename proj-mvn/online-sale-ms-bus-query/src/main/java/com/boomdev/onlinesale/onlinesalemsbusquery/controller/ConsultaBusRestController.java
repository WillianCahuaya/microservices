package com.boomdev.onlinesale.onlinesalemsbusquery.controller;

import com.boomdev.onlinesale.onlinesalemsbusquery.dto.ServicioDto;
import com.boomdev.onlinesale.onlinesalemsbusquery.interfaces.ConsultaBusFeignInterface;
import com.boomdev.onlinesale.onlinesalemsbusquery.proxy.ConsultaBusProxyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaBusRestController {

	@Autowired
	private ConsultaBusProxyInterface consultaBusProxy;
	
	@Autowired
	private ConsultaBusFeignInterface consultaBusFeign;

	@GetMapping("/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioDto> getServicios(@PathVariable("idCliente")Integer idCliente,
										  @PathVariable("idEmpresa") Integer idEmpresa){
		return consultaBusProxy.getServicios(idCliente, idEmpresa);
	}
	
	@GetMapping("/facturacion/feign/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioDto> getServiciosFeign(@PathVariable("idCliente")Integer idCliente,
			@PathVariable("idEmpresa") Integer idEmpresa){
		return consultaBusFeign.getServicios(idCliente, idEmpresa);
	}
}