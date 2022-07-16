package com.ProjectGroup.Practice.Service;

import com.ProjectGroup.Practice.Dto.Receive.Member;

import com.ProjectGroup.Practice.Repository.MemberRepository;
import com.ProjectGroup.Practice.Repository.MongomemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MemberService {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    MongomemRepository mongomemRepository;


    public Long join(Member member){

//        member.setId(memberRepository.setSeq());

        //memberRepository.save(member);

        member.setId(memberRepository.setSeq());

        System.out.println(member);

        mongomemRepository.save(member);

        return member.getId();
    }











//    private MemberRepository memberRepository;

//    public Long join(Member dto){
//
//        Member member = new Member();
//
//        member.setId(dto.getId());
//        member.setUserid(dto.getUserid());
//        member.setName(dto.getName());
//        member.setPassword(dto.getPassword());
//        member.setPasdate(dto.getPasdate());
//
//        validateDuplicateMember(member); //중복 회원 검증
//
//        memberRepository.save(member);
//        return member.getId();
//    }
//
//    private void validateDuplicateMember(Member member) {
//        List<Member> result = memberRepository.findByName(member.getName());
//        if(result.size() != 0){
//            throw new IllegalStateException("이미 존재하는 회원입니다.");
//        }
//    }
}
// TODO Q1. Optional을 주는 예제는 em 생성 안하는데 이 방식으로 해도 되는지
// TODO Q2. store와 EntityManager의 차이점
// TODO Q3. Optional을 사용하지 않고 예외 던져주는 방법 써봤는데 이렇게 해도 될지


