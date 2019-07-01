package com.boomdev.onlinesale.onlinesalemsmanagement.connection;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class ConfigurationDataSource extends PostgresDataSourceEntity {

    private Connection connection;

    public ConfigurationDataSource() {
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static class Connection {

        private Postgres postgres;

        public Postgres getPostgres() {
            return postgres;
        }

        public void setPostgres(Postgres postgres) {
            this.postgres = postgres;
        }
    }

    public static class Postgres {
        private Main main;
        private Main report;

        public Main getMain() {
            return main;
        }

        public Main getReport() {
            return report;
        }

        public void setMain(Main main) {
            this.main = main;
        }

        public void setReport(Main report) {
            this.report = report;
        }
    }

    public static class Main extends PostgresDataSourceEntity {
        public DataConnectionModel getConnection() {
            return new DataConnectionModel(driverclassname, url, username, password);
        }
    }

    public static class Report extends PostgresDataSourceEntity {
        public DataConnectionModel getConnection() {
            return new DataConnectionModel(driverclassname, url, username, password);
        }
    }
}
