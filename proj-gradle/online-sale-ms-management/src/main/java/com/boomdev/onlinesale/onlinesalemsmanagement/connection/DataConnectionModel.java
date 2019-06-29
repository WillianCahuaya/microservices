package com.boomdev.onlinesale.onlinesalemsmanagement.connection;

public class DataConnectionModel {

    private String driverclassname;
    private String url;
    private String username;
    private String password;

    public DataConnectionModel() {
    }

    public DataConnectionModel(String driverclassname, String url, String username, String password) {
        super();
        this.driverclassname = driverclassname;
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public String getDriverclassname() {
        return driverclassname;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
