package com.gymsoftware.repository;

import com.gymsoftware.model.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository{
    public User findByName (String name);

    void save(org.apache.catalina.User user);
}
