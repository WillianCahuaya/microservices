package com.bsoftgroup.springcloudmsnegocioconsulta.service.model;

import java.util.List;

public class CompanyModel {

    private Integer id;
    private String commercialReason;
    private List<ClientModel> clients;

    public CompanyModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommercialReason() {
        return commercialReason;
    }

    public void setCommercialReason(String commercialReason) {
        this.commercialReason = commercialReason;
    }

    public List<ClientModel> getClients() {
        return clients;
    }

    public void setClients(List<ClientModel> clients) {
        this.clients = clients;
    }
}
