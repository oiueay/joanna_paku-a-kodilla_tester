package com.kodilla.spring.basic.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


@Component
@Scope("prototype")
public class Clock {

    LocalDateTime now() {
        return LocalDateTime.now();
    }
}


