package com.boomdev.onlinesale.onlinesalebeanbusiness.dto.business;

import lombok.Data;

@Data
public class ClientDto {

    private Integer id;
    private String fullname;
    private CompanyDto company;

}
