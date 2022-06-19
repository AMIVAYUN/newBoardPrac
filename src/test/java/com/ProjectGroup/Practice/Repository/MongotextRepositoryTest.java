package com.ProjectGroup.Practice.Repository;

import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;

import static org.junit.Assert.*;


@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
public class MongotextRepositoryTest {

    @Autowired MongotextRepository repository;

    public void test234(){
        System.out.println(repository.count());
    }

    @Test
    public void test123(){
        repository.insert(new TextArea(1l,"d","d","d",0,LocalDateTime.now(),Category.LIFE));
    }

}