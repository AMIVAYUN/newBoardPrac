package com.ProjectGroup.Practice.Service;

import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import com.ProjectGroup.Practice.Repository.MongotextRepository;
import com.ProjectGroup.Practice.Repository.MongotextRepositoryTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
class MongoTestTest {
    @Autowired
    MongotextRepository test;

    @Test
    public void 몽고테스트(){
        TextArea a = new TextArea(1L,"본상이","굽스","구구거구걱",0, LocalDateTime.now(), Category.LIFE);
        test.insert( a );

        TextArea b = test.findAll().get(0);
    }

}