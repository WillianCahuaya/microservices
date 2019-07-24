package com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model;

import lombok.Data;

@Data
public class ServiceModel {

	private Integer id;
	private String status;
	private double amount;
	private ClientModel client;
	private ProductModel product;

}
