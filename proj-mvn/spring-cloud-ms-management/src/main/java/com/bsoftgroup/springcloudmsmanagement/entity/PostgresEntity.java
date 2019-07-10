package com.bsoftgroup.springcloudmsmanagement.entity;

public class PostgresEntity {

    private DataSourceEntity main;
    private DataSourceEntity report;

    public DataSourceEntity getMain() {
        return main;
    }

    public void setMain(DataSourceEntity main) {
        this.main = main;
    }

    public DataSourceEntity getReport() {
        return report;
    }

    public void setReport(DataSourceEntity report) {
        this.report = report;
    }

}
