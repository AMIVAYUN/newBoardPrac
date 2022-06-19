package com.ProjectGroup.Practice.EventListener;

import com.ProjectGroup.Practice.Domain.TextArea.TextArea;
import com.ProjectGroup.Practice.Service.SeqGeneratorService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TextAreaListener extends AbstractMongoEventListener<TextArea> {
    private final SeqGeneratorService service;

    @Override
    public void onBeforeConvert( BeforeConvertEvent< TextArea > event ){
        event.getSource().setTextarea_id(service.generateSequence( TextArea.SEQUENCE_NAME ) );
    }
}
