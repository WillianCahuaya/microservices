package com.boomdev.onlinesale.onlinesalemsbusquery.proxy;

import com.boomdev.onlinesale.onlinesalemsbusquery.dto.ServicioDto;

import java.util.List;

public interface ConsultaBusProxyInterface {

	List<ServicioDto> getServicios(Integer idCliente, Integer idEmpresa);
}
