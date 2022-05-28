package com.ProjectGroup.Practice.Repository;

/*
import com.ProjectGroup.Practice.Domain.TextArea.Category;
import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Text;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor  //D.I를 위한 기본적인 어노테이션 // 해당 어노테이션은 생성자 주입 어노테이션 이다.
public class TextAreaRepository {
    private final EntityManager em;

    public Long save( TextArea textArea ){
        em.persist(textArea);
        return textArea.getTextarea_id();
    }

    public void delete( Long text_id ){
        TextArea operand = em.find(TextArea.class,text_id);
        em.remove(operand);
    }

    public List<TextArea> findAll(){
        return em.createQuery("select t from TextArea t").getResultList();
    }

    public List<TextArea> findGameText(){
        return em.createQuery("select t from TextArea t where t.category =:category").setParameter("category", Category.GAME).getResultList();
    }

}


 */

