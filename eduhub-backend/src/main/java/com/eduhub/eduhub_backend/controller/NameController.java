package com.eduhub.eduhub_backend.controller;

import com.eduhub.eduhub_backend.components.CourseService;
import com.eduhub.eduhub_backend.components.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class NameController {

    @Autowired
    NameService nameService;

    @GetMapping("get-name")
    private String getName(){
        return nameService.getName();
    }
}
