package com.codeup.springbootblog.daos;

import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.models.User;
import org.springframework.data.repository.CrudRepository;

// to import the correct class definition we use Option Enter

//the CrudRepository come with Java and give us access to find and more
    public interface UserDao extends CrudRepository <User, Long> {
    }

