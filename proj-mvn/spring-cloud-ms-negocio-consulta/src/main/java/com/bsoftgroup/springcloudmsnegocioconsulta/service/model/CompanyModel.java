package com.bsoftgroup.springcloudmsnegocioconsulta.service.model;

import java.util.List;

public class CompanyModel {

	private Integer code;
	private String businessName;
	private List<ClientModel> clients;

	public CompanyModel() {
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public List<ClientModel> getClients() {
		return clients;
	}

	public void setClients(List<ClientModel> clients) {
		this.clients = clients;
	}
}
