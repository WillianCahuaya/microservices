package com.bsoftgroup.springcloudmsbconsulta.interfaces;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bsoftgroup.springcloudmsbconsulta.dto.ServicioDto;


//@FeignClient(name="ms-consulta", url="localhost:8081")
@FeignClient(name="ms-consulta")
//@RibbonClient(name="ms-consulta")
public interface ConsultaBusFeignInterface {

	@GetMapping(path="/msconsulta/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	List<ServicioDto> getServicios(
			@PathVariable("idCliente")Integer idCliente,
			@PathVariable("idEmpresa") Integer idEmpresa);
	
}
