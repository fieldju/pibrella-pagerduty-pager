package com.fieldju.pager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagerController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

}
