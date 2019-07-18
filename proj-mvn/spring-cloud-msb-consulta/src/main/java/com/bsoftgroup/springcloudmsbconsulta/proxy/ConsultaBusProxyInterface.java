package com.bsoftgroup.springcloudmsbconsulta.proxy;

import java.util.List;

import com.bsoftgroup.springcloudmsbconsulta.dto.ServicioDto;

public interface ConsultaBusProxyInterface {

	List<ServicioDto> getServicios(Integer idCliente, Integer idEmpresa);
}
