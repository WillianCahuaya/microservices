package com.bsoftgroup.springcloudmsnegocioconsulta.data.entity;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "tbl_client")
@Data
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientid")
    private int id;

    @ManyToOne
    @JoinColumn(name = "companyid")
    private CompanyEntity company;

    @Column
    private String fullname;
}
