package com.bsoftgroup.springbootpagolinea.core.interfaces;

import java.util.List;

import com.bsoftgroup.springbootpagolinea.core.negocio.bean.Servicio;
import com.bsoftgroup.springbootpagolinea.core.util.AppException;
import com.bsoftgroup.springbootpagolinea.core.util.Transaccion;
public interface FacturacionServiceInterface {
	
	public List<Servicio> getServicios(Integer idCliente, Integer idEmpresa) throws AppException;
	public Transaccion insertarServicio(Servicio servicio) throws AppException;
	public Transaccion pagarServicio(Servicio servicio) throws AppException;
	public Transaccion deleteServicio(Servicio servicio) throws AppException;
	public Transaccion extornarServicio(Servicio servicio) throws AppException;


}
