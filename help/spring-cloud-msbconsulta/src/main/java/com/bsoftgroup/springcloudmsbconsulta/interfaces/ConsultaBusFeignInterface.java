package com.bsoftgroup.springcloudmsbconsulta.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bsoftgroup.springcloudmsbconsulta.objetos.ServicioDto;

@FeignClient(name="ms-consulta" , url="localhost:8081")
public interface ConsultaBusFeignInterface {
	
	@GetMapping(path="/msconsulta/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioDto> getServicios(@PathVariable("idCliente") Integer idCliente,@PathVariable("idEmpresa") Integer idEmpresa);

}
