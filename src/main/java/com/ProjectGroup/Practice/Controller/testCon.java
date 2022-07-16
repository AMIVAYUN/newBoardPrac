package com.ProjectGroup.Practice.Controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class testCon {
    @Controller
    @AllArgsConstructor
    public class WebController {

        @GetMapping("/vue")
        public String vue(){

            return "vue/index";
        }
    }
}
