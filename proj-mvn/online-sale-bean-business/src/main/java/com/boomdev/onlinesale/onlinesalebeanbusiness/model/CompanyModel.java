package com.boomdev.onlinesale.onlinesalebeanbusiness.model;

import lombok.Data;

import java.util.List;

@Data
public class CompanyModel {

    private Integer id;
    private String commercialReason;
    private List<ClientModel> clients;

}
