package com.ProjectGroup.Practice.Controller.ApiController;

import com.ProjectGroup.Practice.Dto.Receive.Member;
import com.ProjectGroup.Practice.Service.MemberService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;

@Getter
@Setter
public class MemberForm {

    private String UserId;
    private String Name;
    private String Password;

}
