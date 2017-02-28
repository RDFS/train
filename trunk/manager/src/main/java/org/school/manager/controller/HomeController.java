package org.school.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyrics on 2017/2/27.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = "/")
    public String Index() {
        return "index";
    }

    @RequestMapping(value = "login.do")
    public String Login() {
        return "login";
    }
}
