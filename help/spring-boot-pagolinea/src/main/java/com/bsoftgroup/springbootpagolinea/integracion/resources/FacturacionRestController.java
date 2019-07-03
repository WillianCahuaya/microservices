package com.bsoftgroup.springbootpagolinea.integracion.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bsoftgroup.springbootpagolinea.core.interfaces.FacturacionServiceInterface;
import com.bsoftgroup.springbootpagolinea.core.negocio.bean.Servicio;
import com.bsoftgroup.springbootpagolinea.core.util.AppException;
import com.bsoftgroup.springbootpagolinea.core.util.Transaccion;
import com.bsoftgroup.springbootpagolinea.integracion.util.Util;
import com.bsoftgroup.springbootpagolinea.integracion.vo.ServicioVO;

@RestController
public class FacturacionRestController implements FacturacionRestControllerInterface {

	@Autowired
	private FacturacionServiceInterface facturacionService;

	public FacturacionRestController() {
	}

	@Override
	@GetMapping(path = "/facturacion/idCliente/{idCliente}/idEmpresa/{idEmpresa}")
	public List<ServicioVO> getServicios(@PathVariable("idCliente") Integer idCliente, @PathVariable("idEmpresa") Integer idEmpresa) {
		// TODO Auto-generated method stub
		List<ServicioVO> serviciosvo = null;
		try {
			List<Servicio> servicios = facturacionService.getServicios(idCliente, idEmpresa);
			serviciosvo = Util.passLstServicioBeanToServicioVo(servicios);
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return serviciosvo;
	}

	@Override
	public List<ServicioVO> getServiciosRepositorio(Integer idCliente, Integer idEmpresa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PostMapping(path = "/facturacion/registrar")
	public Transaccion insertarServicio(@RequestBody ServicioVO serviciovo) {
		Transaccion tx = new Transaccion();
		try {
			Servicio servicio = Util.passServicioVOToServicioBean(serviciovo);
			tx = facturacionService.insertarServicio(servicio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return tx;
	}

	@Override
	@PutMapping(path="/facturacion/pagar")
	public Transaccion pagarServicio(@RequestBody ServicioVO serviciovo) {
		Transaccion tx= new Transaccion();
		try {
		Servicio servicio = Util.passServicioVOToServicioBean(serviciovo);
		tx = facturacionService.pagarServicio(servicio);
		}catch (Exception e) {
		System.out.println(e.getMessage());
		}
		return tx;
	}

	@Override
	@DeleteMapping(path="/facturacion/delete/{id}")
	public Transaccion deleteServicio(@PathVariable("id")Integer idServicio) {
		// TODO Auto-generated method stub
		Transaccion tx = new Transaccion();
		Servicio servicio = new Servicio();
		servicio.setCodigo(idServicio);
		try {
		tx = facturacionService.deleteServicio(servicio);
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}
		return tx;
	}

	@Override
	public Transaccion extornarServicio(ServicioVO serviciovo) {
		// TODO Auto-generated method stub
		return null;
	}

}
