package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_client_product")
@Data
public class ClientProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientproductid")
    private int id;

    @ManyToOne
    @JoinColumn(name = "clientid")
    private ClientEntity client;

    @ManyToOne
    @JoinColumn(name = "productid")
    private ProductEntity product;

    private double amount;

    private char status;
}
