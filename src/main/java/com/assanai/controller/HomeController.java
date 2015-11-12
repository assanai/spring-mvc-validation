package com.assanai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {

    static private Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {

        LOGGER.info("welcome to home controller...");
        LOGGER.info("test reloading...");

        return "home";
    }

    @RequestMapping(name = "/index", method = RequestMethod.GET)
    private String index() {
        LOGGER.info("test reloading index....");
        return "home";
    }

}