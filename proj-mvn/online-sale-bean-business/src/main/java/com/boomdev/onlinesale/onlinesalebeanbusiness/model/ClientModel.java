package com.boomdev.onlinesale.onlinesalebeanbusiness.model;

import lombok.Data;

import java.util.List;

@Data
public class ClientModel {

	private Integer id;
	private String fullname;
	private CompanyModel company;
	private List<ServiceModel> services;

}
