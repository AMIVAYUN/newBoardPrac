package com.ProjectGroup.Practice.Service;
/*
import com.ProjectGroup.Practice.Domain.Member.Member;

import com.ProjectGroup.Practice.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private MemberRepository memberRepository;

    public Long join(Member dto){

        Member member = new Member();

        member.setId(dto.getId());
        member.setUserid(dto.getUserid());
        member.setName(dto.getName());
        member.setPassword(dto.getPassword());
        member.setPasdate(dto.getPasdate());

        validateDuplicateMember(member); //중복 회원 검증

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        List<Member> result = memberRepository.findByName(member.getName());
        if(result.size() != 0){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}
// TODO Q1. Optional을 주는 예제는 em 생성 안하는데 이 방식으로 해도 되는지
// TODO Q2. store와 EntityManager의 차이점
// TODO Q3. Optional을 사용하지 않고 예외 던져주는 방법 써봤는데 이렇게 해도 될지


*/