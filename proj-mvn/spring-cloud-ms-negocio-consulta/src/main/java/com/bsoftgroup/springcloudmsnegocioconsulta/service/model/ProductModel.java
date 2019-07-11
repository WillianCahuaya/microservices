package com.bsoftgroup.springcloudmsnegocioconsulta.service.model;

import java.util.List;

public class ProductModel {

	private Integer code;
	private String description;
	private double price;
	private List<ServiceModel> services;

	public ProductModel() {
	}

	public ProductModel(Integer code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public ProductModel(Integer code, String description, double price, List<ServiceModel> services) {
		this.code = code;
		this.description = description;
		this.price = price;
		this.services = services;
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

	public List<ServiceModel> getServices() {
		return services;
	}

	public void setServices(List<ServiceModel> services) {
		this.services = services;
	}
}
