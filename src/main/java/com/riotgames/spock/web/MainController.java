package com.riotgames.spock.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MainController {
    @RequestMapping("/hello")
    public String hello() {
        log.info("/hello");
        return "version 0.0.1";
    }
}
