package com.bao.controller;

import lombok.extern.slf4j.Slf4j;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 16/10/12.
 */
@Slf4j
@RestController
public class TestController {
    @RequestMapping("/index")
    public String index() {
        log.info("first");
        return "Greetings from Spring Boot!";
    }

}
