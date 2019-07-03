package com.bsoftgroup.springcloudmsconsulta.integracion.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.springcloudmsconsulta.core.interfaces.ConsultaServiceInterface;
import com.bsoftgroup.springcloudmsconsulta.core.negocio.bean.Servicio;
import com.bsoftgroup.springcloudmsconsulta.core.util.AppException;
import com.bsoftgroup.springcloudmsconsulta.integracion.dto.ServicioDto;
import com.bsoftgroup.springcloudmsconsulta.integracion.util.Util;

@RestController
public class ConsultaRestController {

	@Autowired
	private ConsultaServiceInterface consultaService;

	public ConsultaRestController() {
	}

	@GetMapping(path="/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioDto> getServicios(@PathVariable("idCliente") Integer idCliente,@PathVariable("idEmpresa") Integer idEmpresa) {
		// TODO Auto-generated method stub
		List<ServicioDto> serviciosdto = null;
		try {
			List<Servicio> servicios = consultaService.getServicios(idCliente, idEmpresa);
			serviciosdto = Util.passLstServicioBeanToServicioDto(servicios);
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return serviciosdto;
	}
}