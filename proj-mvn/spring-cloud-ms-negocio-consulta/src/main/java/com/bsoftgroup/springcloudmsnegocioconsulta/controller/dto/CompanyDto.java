package com.bsoftgroup.springcloudmsnegocioconsulta.controller.dto;

public class CompanyDto {

    private Integer code;
    private String businessName;

    public CompanyDto() {
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
}
