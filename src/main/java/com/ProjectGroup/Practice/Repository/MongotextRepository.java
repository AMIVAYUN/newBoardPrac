package com.ProjectGroup.Practice.Repository;

import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import org.springframework.stereotype.Repository;


@Repository
public interface MongotextRepository extends org.springframework.data.mongodb.repository.MongoRepository<TextArea, Long > {

}
