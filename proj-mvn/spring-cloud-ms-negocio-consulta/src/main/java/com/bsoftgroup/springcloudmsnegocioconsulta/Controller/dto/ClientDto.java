package com.bsoftgroup.springcloudmsnegocioconsulta.Controller.dto;

public class ClientDto {

    private Integer code;
    private String name;
    private CompanyDto company;

    public ClientDto() {
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

    public CompanyDto getCompany() {
        return company;
    }

    public void setCompany(CompanyDto company) {
        this.company = company;
    }
}
