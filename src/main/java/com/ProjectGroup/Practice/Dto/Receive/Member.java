package com.ProjectGroup.Practice.Dto.Receive;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Data
public class Member {

    private long id;
    private String userid;
    private String password;
    private String name;
    private LocalDateTime pasdate;

}
