package com.boomdev.onlinesale.onlinesalebeanbusiness.entity.configuration;

import lombok.Data;

@Data
public class PostgresEntity {

    private DataConnectionEntity main;
    private DataConnectionEntity report;
}
