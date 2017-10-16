package com.selegant.controller;

import com.selegant.service.HelloBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBlog {

    @Autowired
    HelloBlogService helloBlogService;

    @RequestMapping(value = "helloBolg")
    @ResponseBody
    public String helloBlog(){
        return helloBlogService.helloBlog();
    }
}
