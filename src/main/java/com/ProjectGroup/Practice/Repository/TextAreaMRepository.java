package com.ProjectGroup.Practice.Repository;

import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TextAreaMRepository extends MongoRepository<TextArea, Long> {
}
