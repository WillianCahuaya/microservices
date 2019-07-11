package com.bsoftgroup.springcloudmsnegocioconsulta.service.model;

import java.util.List;

public class ProductModel {

	private Integer id;
	private String description;
	private double price;
	private List<ServiceModel> services;

	public ProductModel() {
	}

	public ProductModel(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public ProductModel(Integer id, String description, double price, List<ServiceModel> services) {
		this.id = id;
		this.description = description;
		this.price = price;
		this.services = services;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
