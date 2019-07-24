package com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model;

import lombok.Data;

import java.util.List;

@Data
public class ClientModel {

	private Integer id;
	private String fullname;
	private CompanyModel company;
	private List<ServiceModel> services;

}
