package com.ProjectGroup.Practice.Controller.ApiController;

import com.ProjectGroup.Practice.Dto.Receive.MemberLoginDto;
import com.ProjectGroup.Practice.Dto.Send.Logresult;
import com.ProjectGroup.Practice.Service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/member/log-in")
    public ResponseEntity<Logresult > getLogin(@RequestBody MemberLoginDto dto ){
        log.info("로그인 정보: :" + dto.getUserId() );

        Logresult result = new Logresult();
        result.setResult("성공!");
        return new ResponseEntity< Logresult > (  result, HttpStatus.valueOf(200) );

    }
}
