package com.ProjectGroup.Practice.Dto.Receive;

import lombok.Data;

@Data //getter setter 자동으로 만들어줌.
public class TextWrite {
    private String title;
    private String content;
    private String writer;
    private String category;

}
