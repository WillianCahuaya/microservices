package com.boomdev.onlinesale.onlinesalemsmanagement.connection;

public class PostgresDataSourceEntity {

    protected String driverclassname;
    protected String url;
    protected String username;
    protected String password;

    public void setDriverclassname(String driverclassname) {
        this.driverclassname = driverclassname;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
