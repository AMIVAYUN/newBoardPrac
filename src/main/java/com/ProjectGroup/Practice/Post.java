package com.ProjectGroup.Practice;

import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import com.ProjectGroup.Practice.Dto.Receive.Member;
import com.ProjectGroup.Practice.Repository.MongotextRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class Post {
    @Autowired private MongotextRepository repository;

    @PostConstruct
    public void initialize(){
        Long seq = Long.valueOf(repository.count() + 1);
        TextArea area = new TextArea(seq, "d","da","dad",1, LocalDateTime.now(), Category.LIFE);
        repository.insert(area);

        List<TextArea> b = repository.findAll();
        b.stream().forEach( in -> System.out.println(in.getTitle()));



    }
}
