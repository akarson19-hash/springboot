package com.eduhub.eduhub_backend.components;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class NameService {
    public String getName(){
        return "springboot";
    }
}
