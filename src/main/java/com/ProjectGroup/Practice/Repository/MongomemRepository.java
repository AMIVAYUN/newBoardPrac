package com.ProjectGroup.Practice.Repository;

import com.ProjectGroup.Practice.Dto.Receive.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface MongomemRepository extends org.springframework.data.mongodb.repository.MongoRepository<Member, Long > {

    //Optional<Member> findById(Long id);

    List<Member> findAll();

    List<Member> findByName(String name);
}
