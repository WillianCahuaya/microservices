package com.bsoftgroup.springbootpagolinea.core.negocio.bean;

public class Servicio {
	
	private Integer codigo;
	private String estado;
	private Integer monto;
	
	//atributos de relaciones cliente 1
	private Cliente cliente;
	
	//atributos de relaciones producto
	private Producto producto;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	

}
