package com.bsoftgroup.springcloudmsconsulta.integracion.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bsoftgroup.springcloudmsconsulta.core.negocio.bean.Servicio;
import com.bsoftgroup.springcloudmsconsulta.integracion.dto.ClienteDto;
import com.bsoftgroup.springcloudmsconsulta.integracion.dto.ProductoDto;
import com.bsoftgroup.springcloudmsconsulta.integracion.dto.ServicioDto;

public class Util {

	public static List<ServicioDto> passLstServicioBeanToServicioDto(List<Servicio> servicios) {
		List<ServicioDto> serviciosdto = new ArrayList<>();
		Iterator<Servicio> itServicio = servicios.iterator();
		
		while (itServicio.hasNext()) {
			Servicio serviciotmp = itServicio.next();
			ServicioDto serviciodtotmp = new ServicioDto();
			ProductoDto productodtotmp = new ProductoDto();
			ClienteDto clientedtotmp = new ClienteDto();
			
			serviciodtotmp.setCodigo(serviciotmp.getCodigo());
			serviciodtotmp.setEstado(serviciotmp.getEstado());
			serviciodtotmp.setMonto(serviciotmp.getMonto());
			clientedtotmp.setCodigo(serviciotmp.getCliente().getCodigo());
			clientedtotmp.setNombres(serviciotmp.getCliente().getNombres());
			productodtotmp.setCodigo(serviciotmp.getProducto().getCodigo());
			productodtotmp.setDescripcion(serviciotmp.getProducto().getDescripcion());
			serviciodtotmp.setCliente(clientedtotmp);
			serviciodtotmp.setProducto(productodtotmp);
			serviciosdto.add(serviciodtotmp);
			serviciodtotmp = null;
		}
		
		return serviciosdto;
	}
}
