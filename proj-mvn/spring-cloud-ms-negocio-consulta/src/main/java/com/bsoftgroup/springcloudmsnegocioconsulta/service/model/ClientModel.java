package com.bsoftgroup.springcloudmsnegocioconsulta.service.model;

import java.util.List;

public class ClientModel {

	private Integer id;
	private String name;
	private CompanyModel company;
	private List<ServiceModel> services;

	public ClientModel() {
	}

	public ClientModel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public ClientModel(Integer id, String name, CompanyModel company, List<ServiceModel> services) {
		this.id = id;
		this.name = name;
		this.company = company;
		this.services = services;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyModel getCompany() {
		return company;
	}

	public void setCompany(CompanyModel company) {
		this.company = company;
	}

	public List<ServiceModel> getServices() {
		return services;
	}

	public void setServices(List<ServiceModel> services) {
		this.services = services;
	}
}
