package com.kodilla.spring.basic.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;


@Component
@Scope("prototype")
public class Clock {

    private LocalTime time;

    public Clock(LocalTime time) {
        this.time = time;
    }

    LocalTime getTime() {
        return time;
    }
}


