package com.cheba00.services;

import com.cheba00.models.User;

import java.util.List;

public interface IUserService {
    public List<User> userList();

    public Integer count();

    public void save(User entity);

    public void update(User entity);

    public User findByName(String propertyName, Object value);

    public User findById(Integer id);

    public void delete(Integer id);
}
