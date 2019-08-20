package com.boomdev.onlinesale.onlinesalebeanbusiness.entity.configuration;

import lombok.Data;

@Data
public class ConnectionEntity {

    private PostgresEntity postgres;
    private MysqlEntity mysql;
    private MongodbEntity mongodb;
}
