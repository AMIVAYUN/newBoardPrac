package com.ProjectGroup.Practice.Dto.Receive;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "Member")
@Data
@Getter
@Setter
public class Member {

    @Id
    private long id;
    private String userid;
    private String password;
    private String name;
    private LocalDateTime pasdate;

}
