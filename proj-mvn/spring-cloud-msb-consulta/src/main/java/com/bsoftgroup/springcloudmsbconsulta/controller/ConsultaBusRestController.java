package com.bsoftgroup.springcloudmsbconsulta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.bsoftgroup.springcloudmsbconsulta.dto.ServicioDto;
import com.bsoftgroup.springcloudmsbconsulta.interfaces.ConsultaBusFeignInterface;
import com.bsoftgroup.springcloudmsbconsulta.proxy.ConsultaBusProxyInterface;

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