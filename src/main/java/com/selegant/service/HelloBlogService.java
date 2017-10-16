package com.selegant.service;

import com.selegant.dao.HelloBlogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloBlogService {
    @Autowired
    HelloBlogDao helloBlogDao;

    public String helloBlog(){
        return helloBlogDao.helloBlog();
    }
}
