package com.ProjectGroup.Practice.Repository;


import com.ProjectGroup.Practice.Dto.Receive.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final MongomemRepository mongomemRepository;

    Query query = new Query();

    public long setSeq(){
        long seq = mongomemRepository.count() + 1;
        return seq;
    }

    public List<Member> findById(long id){
        List<Member> result;
        result = mongomemRepository.findById(id);

        if(result == null)
            new IllegalArgumentException("데이터가 없습니다.");

        return result;
    }

    public List<Member> findByName(String name){
        List<Member> result = null;

        result = mongomemRepository.findByName(name);

        if(result == null)
            new IllegalArgumentException("데이터가 없습니다.");

        return result;
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