package com.bsoftgroup.springbootpagolinea.integracion.resources;

import java.util.List;



import com.bsoftgroup.springbootpagolinea.core.util.Transaccion;
import com.bsoftgroup.springbootpagolinea.integracion.vo.ServicioVO;


public interface FacturacionRestControllerInterface {
	
	public List<ServicioVO> getServicios(Integer idCliente,Integer idEmpresa);
	public List<ServicioVO> getServiciosRepositorio(Integer idCliente,Integer idEmpresa);
	public Transaccion insertarServicio(ServicioVO serviciovo);
	public Transaccion pagarServicio(ServicioVO serviciovo);
	public Transaccion deleteServicio(Integer idServicio);
	public Transaccion extornarServicio(ServicioVO serviciovo);

}
