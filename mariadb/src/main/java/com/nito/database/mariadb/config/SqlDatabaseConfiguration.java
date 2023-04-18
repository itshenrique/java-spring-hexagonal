package com.nito.database.mariadb.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.nito.database.mariadb")
@EntityScan(basePackages = "com.nito.database.mariadb")
public class SqlDatabaseConfiguration {
}
