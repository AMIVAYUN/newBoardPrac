package com.ProjectGroup.Practice.Repository;


import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TextAreaMRepositoryTest {
    @Autowired TextAreaMRepository repository;

    @Test
    public void 제발되라(){
        TextArea a = new TextArea();
        a.setCategory(Category.LIFE);
        a.setTitle("d");
        a.setWriter("da");
        a.setConTent("dad");
        a.setTextarea_id( 1l );
    }

}