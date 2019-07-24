package com.boomdev.onlinesale.onlinesalemsbusinessquery.data.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private int id;

    @Column(length = 200)
    private String description;

    private double price;
}
