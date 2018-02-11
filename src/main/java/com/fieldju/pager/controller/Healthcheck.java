package com.fieldju.pager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class Healthcheck {

    @RequestMapping("/healthcheck")
    public void healthcheck(HttpServletResponse response) {
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }

}
