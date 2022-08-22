package com.ProjectGroup.Practice;

import com.ProjectGroup.Practice.Dto.Receive.Member;
import com.ProjectGroup.Practice.Dto.Receive.MemberLoginDto;
import com.ProjectGroup.Practice.Repository.MemberRepository;
import com.ProjectGroup.Practice.Repository.MongomemRepository;
import com.ProjectGroup.Practice.Repository.MongotextRepository;
import com.ProjectGroup.Practice.Repository.MongotextRepositoryTest;

import com.ProjectGroup.Practice.Service.MemberService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;


@SpringBootTest
public class MakeBoardApplicationTest {

    @Autowired
    MongomemRepository mongomemRepository;

    MongoOperations mongoOperations;

    @Autowired
    MemberRepository memberRepository;

    private MongoTemplate mongoTemplate;

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {

        MemberLoginDto memberLoginDto = new MemberLoginDto();
        memberLoginDto.setUserId("koobs97");
        memberLoginDto.setPassword("kbs9729");

        boolean result;

        result = memberService.findByLogin(memberLoginDto);

        System.out.println(result);









//        Member member = new Member();
//        member.setId(memberRepository.setSeq());
//        member.setUserid("koobs97");
//        member.setPassword("1234");
//        member.setName("구구구");
//        member.setPasdate(LocalDateTime.now());


        //findById 테스트
        //System.out.println("[findById 테스트]\n" + memberRepository.findById(5));
        //findByName 테스트
//        System.out.println("[findByName 테스트]\n" + memberRepository.findByName("구구구"));
        //mongomemRepository.findById(1).forEach(System.out::println);
        //생성테스트
//        System.out.println("[생성 완료]\n" + mongomemRepository.save(member));


    }
}