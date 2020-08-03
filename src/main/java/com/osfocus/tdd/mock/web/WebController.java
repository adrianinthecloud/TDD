package com.osfocus.tdd.mock.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WebController {
    @Value("${version}")
    private String version;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(String _t) {
        if (_t != null) return "redirect:/";

        return "index";
    }

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String version() {
        return this.version;
    }

    public String member() {
        return "Member Page";
    }
}
