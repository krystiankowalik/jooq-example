package com.github.krystiankowalik.jooqexample;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class JooqApplication {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        SpringApplication.run(JooqApplication.class, args);

    }

}

