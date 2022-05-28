package com.ProjectGroup.Practice.Service;
/*
import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;

import com.ProjectGroup.Practice.Dto.Receive.TextWrite;
import com.ProjectGroup.Practice.Repository.TextAreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TextArService {
    private final TextAreaRepository textAreaRepository;

    public Long writeByUSER(TextWrite dto){
        TextArea newAr= new TextArea();
        newAr.setConTent(dto.getContent());
        newAr.setTitle(dto.getTitle());
        newAr.setWriter(dto.getWriter());
        newAr.setCategory(TextArService.getByString(dto.getCategory()));
        return textAreaRepository.save(newAr);
    }
    public static Category getByString( String str ){
        switch (str){
            case "game":
                return Category.GAME;
            case "life":
                return Category.LIFE;
            default:
                return null;
        }
    }
}




 */