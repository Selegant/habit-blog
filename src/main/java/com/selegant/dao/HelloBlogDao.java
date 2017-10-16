package com.selegant.dao;

import com.selegant.mapper.HelloBlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HelloBlogDao {

    @Autowired
    private HelloBlogMapper helloBlogMapper;

    public String helloBlog(){
        return helloBlogMapper.helloBlog();
    }
}
