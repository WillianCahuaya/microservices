package com.bsoftgroup.springcloudmsbconsulta.dto;

public class ServicioDto {

	private Integer codigo;
	private String estado;
	private Integer monto;
	private ClienteDto cliente;
	private ProductoDto producto;
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
	public ClienteDto getCliente() {
		return cliente;
	}
	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}
	public ProductoDto getProducto() {
		return producto;
	}
	public void setProducto(ProductoDto producto) {
		this.producto = producto;
	}

}
