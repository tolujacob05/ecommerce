package com.tolujacob.ecommerce.config;

import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlywayRepairConfig {

    private static final Logger log = LoggerFactory.getLogger(FlywayRepairConfig.class);

    @Bean
    public FlywayMigrationStrategy cleanMigrateStrategy() {
        FlywayMigrationStrategy strategy = new FlywayMigrationStrategy() {
            @Override
            public void migrate(Flyway flyway) {
                log.info("Running Flyway repair...");
                flyway.repair();
                log.info("Flyway repair completed...");
                log.info("Flyway migration ongoing...");
                flyway.migrate();
                log.info("Flyway migration completed...");

            }
        };
        return strategy;
    }

}
