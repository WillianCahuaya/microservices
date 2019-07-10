package com.bsoftgroup.springcloudmsnegocioconsulta.core.util;

public class Util {

//	public static List<ServicioVO> passLstServicioBeanToServicioVo(List<ServiceModel> servicios) {
//		List<ServicioVO> serviciosvo = new ArrayList<>();
//		Iterator<ServiceModel> itServicio = servicios.iterator();
//		while (itServicio.hasNext()) {
//			ServiceModel serviciotmp = itServicio.next();
//			ServicioVO serviciovotmp = new ServicioVO();
//			ProductoVO productovotmp = new ProductoVO();
//			ClienteVO clientevotmp = new ClienteVO();
//
//			serviciovotmp.setCodigo(String.valueOf(serviciotmp.getCodigo()));
//			serviciovotmp.setEstado(serviciotmp.getEstado());
//			serviciovotmp.setMonto(new Integer(serviciotmp.getMonto()).toString());
//			if (serviciotmp.getClient() != null) {
//				clientevotmp.setNombres(serviciotmp.getClient().getNombres());
//				clientevotmp.setCodigo(serviciotmp.getClient().getCodigo().toString());
//			}
//			productovotmp.setCodigo(new Integer(serviciotmp.getProduct().getCodigo()).toString());
//			productovotmp.setDescripcion(serviciotmp.getProduct().getDescripcion());
//			serviciovotmp.setClient(clientevotmp);
//			serviciovotmp.setProduct(productovotmp);
//			serviciosvo.add(serviciovotmp);
//		}
//
//		return serviciosvo;
//	}
//
//	public static ServiceModel passServicioVOToServicioBean(ServicioVO serviciovo) {
//		ServiceModel servicio = new ServiceModel();
//		ServicioVO serviciovotmp = serviciovo;
//		ProductModel producto = new ProductModel();
//		ClientModel cliente = new ClientModel();
//		if (serviciovotmp.getCodigo() != null)
//			servicio.setCodigo(new Integer(serviciovotmp.getCodigo()));
//		servicio.setEstado(serviciovotmp.getEstado());
//		if (serviciovotmp.getMonto() != null)
//			servicio.setMonto(new Integer(serviciovotmp.getMonto()));
//		if (serviciovotmp.getClient() != null) {
//			cliente.setNombres(serviciovotmp.getClient().getNombres());
//			cliente.setCodigo(new Integer(serviciovotmp.getClient().getCodigo()));
//		}
//		if (serviciovotmp.getProduct() != null) {
//			producto.setCodigo(new Integer(serviciovotmp.getProduct().getCodigo()));
//			producto.setDescripcion(serviciovotmp.getProduct().getDescripcion());
//		}
//
//		servicio.setClient(cliente);
//		servicio.setProduct(producto);
//		return servicio;
//
//	}

}
