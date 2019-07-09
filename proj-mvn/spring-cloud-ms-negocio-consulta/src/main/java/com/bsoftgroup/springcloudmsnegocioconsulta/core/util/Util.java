package com.bsoftgroup.springcloudmsnegocioconsulta.core.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bsoftgroup.springcloudmsnegocioconsulta.model.Cliente;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.Producto;
import com.bsoftgroup.springcloudmsnegocioconsulta.model.Servicio;

public class Util {

//	public static List<ServicioVO> passLstServicioBeanToServicioVo(List<Servicio> servicios) {
//		List<ServicioVO> serviciosvo = new ArrayList<>();
//		Iterator<Servicio> itServicio = servicios.iterator();
//		while (itServicio.hasNext()) {
//			Servicio serviciotmp = itServicio.next();
//			ServicioVO serviciovotmp = new ServicioVO();
//			ProductoVO productovotmp = new ProductoVO();
//			ClienteVO clientevotmp = new ClienteVO();
//
//			serviciovotmp.setCodigo(String.valueOf(serviciotmp.getCodigo()));
//			serviciovotmp.setEstado(serviciotmp.getEstado());
//			serviciovotmp.setMonto(new Integer(serviciotmp.getMonto()).toString());
//			if (serviciotmp.getCliente() != null) {
//				clientevotmp.setNombres(serviciotmp.getCliente().getNombres());
//				clientevotmp.setCodigo(serviciotmp.getCliente().getCodigo().toString());
//			}
//			productovotmp.setCodigo(new Integer(serviciotmp.getProducto().getCodigo()).toString());
//			productovotmp.setDescripcion(serviciotmp.getProducto().getDescripcion());
//			serviciovotmp.setCliente(clientevotmp);
//			serviciovotmp.setProducto(productovotmp);
//			serviciosvo.add(serviciovotmp);
//		}
//
//		return serviciosvo;
//	}
//
//	public static Servicio passServicioVOToServicioBean(ServicioVO serviciovo) {
//		Servicio servicio = new Servicio();
//		ServicioVO serviciovotmp = serviciovo;
//		Producto producto = new Producto();
//		Cliente cliente = new Cliente();
//		if (serviciovotmp.getCodigo() != null)
//			servicio.setCodigo(new Integer(serviciovotmp.getCodigo()));
//		servicio.setEstado(serviciovotmp.getEstado());
//		if (serviciovotmp.getMonto() != null)
//			servicio.setMonto(new Integer(serviciovotmp.getMonto()));
//		if (serviciovotmp.getCliente() != null) {
//			cliente.setNombres(serviciovotmp.getCliente().getNombres());
//			cliente.setCodigo(new Integer(serviciovotmp.getCliente().getCodigo()));
//		}
//		if (serviciovotmp.getProducto() != null) {
//			producto.setCodigo(new Integer(serviciovotmp.getProducto().getCodigo()));
//			producto.setDescripcion(serviciovotmp.getProducto().getDescripcion());
//		}
//
//		servicio.setCliente(cliente);
//		servicio.setProducto(producto);
//		return servicio;
//
//	}

}
