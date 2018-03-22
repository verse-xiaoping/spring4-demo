package com.github.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by verse on 2018/3/22.
 */
@Controller
public class HelloController {
    @RequestMapping(value="hello", method= RequestMethod.GET)
    public String hello(Model model) {
        return "hello";
    }
}
