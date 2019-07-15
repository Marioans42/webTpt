package com.tpt.web.mainapp.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class Application {
	private static final Logger log = LogManager.getLogger(Application.class);
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        log.info("Configuration Application");
    }
}
