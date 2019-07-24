package com.boomdev.onlinesale.onlinesalemsbusinessquery.service.model;

import lombok.Data;

import java.util.List;

@Data
public class ProductModel {

	private Integer id;
	private String description;
	private double price;
	private List<ServiceModel> services;

}
