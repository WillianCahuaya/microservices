package com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto;

public class ProductDto {
	private Integer code;
	private String description;
	private double price;

	public ProductDto() {
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
