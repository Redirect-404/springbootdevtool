package com.test.springbootdevtool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pager {
    @GetMapping("/{page}")
    public String getPage(@PathVariable String page){
        System.out.println(""+page);
        return page;
    }
}
