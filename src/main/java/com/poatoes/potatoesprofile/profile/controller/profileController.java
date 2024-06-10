package com.poatoes.potatoesprofile.profile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("profile")
public class profileController {

    @RequestMapping("main")
    public ModelAndView main() {
        return new ModelAndView("main");
    }

    @RequestMapping("test")
    public ModelAndView test() {
        return new ModelAndView("test");
    }

}
