package com.bsoftgroup.springcloudmsnegocioconsulta.service.model;

import java.util.List;

public class ClientModel {

	private Integer code;
	private String name;
	private CompanyModel company;
	private List<ServiceModel> services;

	public ClientModel() {
	}

	public ClientModel(Integer code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public ClientModel(Integer code, String name, CompanyModel company, List<ServiceModel> services) {
		this.code = code;
		this.name = name;
		this.company = company;
		this.services = services;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
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
