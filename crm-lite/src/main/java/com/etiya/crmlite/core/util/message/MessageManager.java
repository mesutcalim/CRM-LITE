package com.etiya.crmlite.core.util.message;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageManager implements IMessageService {

    @Autowired
    private MessageSource messageSource;


    @Override
    public String Messages(String message) {
        return messageSource.getMessage(message,null, LocaleContextHolder.getLocale());
    }
}

