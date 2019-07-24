package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.entity;

import lombok.Data;

import javax.persistence.*;

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
