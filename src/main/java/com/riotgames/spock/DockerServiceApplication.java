package com.riotgames.spock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class DockerServiceApplication {

    public static void main(String argv[]) {
        SpringApplication.run(DockerServiceApplication.class, argv);
    }
}
