package com.ProjectGroup.Practice.Repository;

import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.w3c.dom.Text;

import java.time.LocalDateTime;





@SpringBootTest
public class MongotextRepositoryTest {

    //@Autowired MongotextRepository repository;

    public void test234(){
        System.out.println("repository.count()");
    }

//    @Test
//    public void test123(){
//        TextArea area = new TextArea();
//        area.setCategory(Category.LIFE);
//        area.setConTent("d");
//        area.setTitle("d");
//        area.setViewCount(0);
//        area.setWriter("hi");
//        repository.insert(area);
//    }

}