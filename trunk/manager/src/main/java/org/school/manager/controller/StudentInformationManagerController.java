package org.school.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lyrics on 2017/2/28.
 */
@Controller
@RequestMapping("/student")
public class StudentInformationManagerController {
    @RequestMapping("/index.do")
    public String Student() {
        return "student/index";
    }
}
