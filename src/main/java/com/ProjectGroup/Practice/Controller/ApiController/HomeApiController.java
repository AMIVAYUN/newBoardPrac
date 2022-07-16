package com.ProjectGroup.Practice.Controller.ApiController;


import com.ProjectGroup.Practice.Controller.HomeController;
import com.ProjectGroup.Practice.Dto.Receive.Member;
import com.ProjectGroup.Practice.Dto.Receive.TextWrite;
import com.ProjectGroup.Practice.Repository.MemberRepository;
import com.ProjectGroup.Practice.Repository.MongomemRepository;
import com.ProjectGroup.Practice.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class HomeApiController {

    private final MemberService memberService;
    MongomemRepository mongomemRepository;




//    private final TextArService taSerivice;
//
//    @PostMapping("/textArea")
//    public Long saveNewText(@RequestBody TextWrite writedto){
//        return taSerivice.writeByUSER(writedto);
//
//    }
}


