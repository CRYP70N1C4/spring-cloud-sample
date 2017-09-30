package com.fire;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerGitApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}