package com.bsoftgroup.springcloudmsnegocioconsulta.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_company")
@Data
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "companyid")
    private int id;

    @Column(name = "commercialreason", length = 200)
    private String commercialReason;

}
