package com.ProjectGroup.Practice.Controller.ApiController;


import com.ProjectGroup.Practice.Dto.Receive.TextWrite;
import com.ProjectGroup.Practice.Service.TextArService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@RestController
@RequiredArgsConstructor
public class HomeApiController {
    private final TextArService taSerivice;

    @PostMapping("/textArea")
    public Long saveNewText(@RequestBody TextWrite writedto){
        return taSerivice.writeByUSER(writedto);

    }
}
