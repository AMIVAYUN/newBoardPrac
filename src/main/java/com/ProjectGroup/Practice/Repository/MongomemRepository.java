package com.ProjectGroup.Practice.Repository;

import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import com.ProjectGroup.Practice.Dto.Receive.Member;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MongomemRepository extends org.springframework.data.mongodb.repository.MongoRepository<Member, Long > {

    List<Member> findById(long id);
    List<Member> findByName(String name);
}
