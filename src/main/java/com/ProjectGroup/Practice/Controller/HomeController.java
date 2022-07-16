package com.ProjectGroup.Practice.Controller;


import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController
//TODO 해당 어노테이션은 이하 Rest는 객체 반환에 특화되어있는 친구. 그래서 리턴을 리스폰스 바디.
@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "newHome";
    }
    @GetMapping("/prev")
    public String home2(){
        return "Sub";
    }
    @GetMapping("/log-in")
    public String logIn(){
        return "/Private/login";
    }

}