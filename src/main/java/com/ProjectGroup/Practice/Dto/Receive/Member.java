package com.ProjectGroup.Practice.Dto.Receive;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Member {

    private long id;
    private String userid;
    private String password;
    private String name;
    private LocalDateTime pasdate;

}
