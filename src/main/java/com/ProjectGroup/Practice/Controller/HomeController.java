package com.ProjectGroup.Practice.Controller;


import com.ProjectGroup.Practice.Controller.ApiController.MemberForm;
import com.ProjectGroup.Practice.Dto.Receive.Member;
import com.ProjectGroup.Practice.Service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.script.ScriptException;
import java.time.LocalDateTime;

//@RestController
//TODO 해당 어노테이션은 이하 Rest는 객체 반환에 특화되어있는 친구. 그래서 리턴을 리스폰스 바디.
@Controller
public class HomeController {

    private final MemberService memberService;

    public HomeController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String home(){
        return "Sub";
    }

    @GetMapping("/login")
    public String login(){
        return "Member";
    }

    @RequestMapping(value = "/login")
    public String create(MemberForm form){

        Member member = new Member();
        member.setUserid(form.getUserId());
        member.setName(form.getName());
        member.setPassword(form.getPassword());
        member.setPasdate(LocalDateTime.now());

        memberService.join(member);

        return "loginSuccess";
    }
}
