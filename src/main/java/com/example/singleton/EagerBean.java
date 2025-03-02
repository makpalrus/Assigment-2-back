package com.example.singleton;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("EagerBean created.");
    }
}
