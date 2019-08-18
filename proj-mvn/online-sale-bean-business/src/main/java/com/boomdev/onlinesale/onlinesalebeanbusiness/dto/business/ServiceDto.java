package com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business;

import lombok.Data;

@Data
public class ServiceDto {

	private Integer id;
	private String status;
	private double amount;
	private ClientDto client;
	private ProductDto product;

}
