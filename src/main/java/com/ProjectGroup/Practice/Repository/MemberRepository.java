package com.ProjectGroup.Practice.Repository;


import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    @Autowired
    private MongotextRepository repository;

    public void generateSequence(){



    }




























    /*
    private final EntityManager em;
    private static long sequence = 0L;
    public Member save(Member member){
        member.setId(++sequence);
        em.persist(member);
        return member;
    }
    public List<Member> findById(Long id){
        List<Member> result = em.createQuery("select m from Member m where m.id =:id", Member.class).setParameter("id", id).getResultList();

        if(result.isEmpty())
            new IllegalArgumentException("데이터가 없습니다.");

        return result;
    }
    public List<Member> findByName(String name){
        List<Member> result = em.createQuery("select m from Member m where m.name =:name", Member.class).setParameter("name", name).getResultList();

        if(result.isEmpty())
            new IllegalArgumentException("데이터가 없습니다.");

        return result;
    }
    public List<Member> findall(){
        return em.createQuery("select m from Member m", Member.class).getResultList();
    }
    */



}