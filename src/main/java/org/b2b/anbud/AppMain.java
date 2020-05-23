package org.b2b.anbud;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class AppMain {
    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }
}

