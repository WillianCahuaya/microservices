package com.bsoftgroup.springcloudmsbconsulta.proveedor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.springcloudmsbconsulta.interfaces.ConsultaBusFeignInterface;
import com.bsoftgroup.springcloudmsbconsulta.interfaces.ConsultaBusProxyInterface;
import com.bsoftgroup.springcloudmsbconsulta.objetos.ServicioDto;

@RestController
public class ConsultaBusRestController {
	
	@Autowired
	private ConsultaBusProxyInterface consultaBusProxy;
	
	@Autowired
	private ConsultaBusFeignInterface consultaBusFeign;

	@GetMapping(path="/servicios/consulta")
	public List<ServicioDto> getServicios(){
		
		return consultaBusProxy.getServicios();
	}
	@GetMapping("/facturacion/feign/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioDto> getServiciosFeign(@PathVariable("idCliente") Integer idCliente,@PathVariable("idEmpresa") Integer idEmpresa){
	      return consultaBusFeign.getServicios(idCliente, idEmpresa);
	} 

}
