package com.ProjectGroup.Practice.Domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document( collection = "auto_seq")
public class Sequence {
    @Id
    private String _id;
    private Long seq;
}
