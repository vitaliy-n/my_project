package com.cheba00.services;

import com.cheba00.dao.interf.IUserDao;
import com.cheba00.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;
    @Autowired
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> userList() {
        return userDao.findAll();
    }

    @Override
    @Transactional
    public Integer count() {
        return 0;
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);

    }

    @Override
    @Transactional
    public User findByName(String propertyName, Object value) {
        return userDao.findByName(propertyName, value);
    }

    @Override
    @Transactional
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userDao.delete(id);

    }
}
