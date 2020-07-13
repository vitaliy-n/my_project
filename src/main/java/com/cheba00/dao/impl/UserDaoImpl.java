package com.cheba00.dao.impl;

import com.cheba00.dao.interf.IUserDao;
import com.cheba00.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements IUserDao {

    private static final Logger logger = LoggerFactory.getLogger(User.class);

    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer id) {
        Session session = sessionFactory.openSession();
        User user = session.load(User.class, id);
        if (user != null) {
            session.delete(user);
            logger.info("User successfully deleted. info:" + user);
        }
        session.close();

    }

    @Override
    public List<User> findAll() {
        Session session = sessionFactory.openSession();
        List<User> userList = session.createQuery("select a from User a", User.class).getResultList();
        for (User user : userList) {
            logger.info("User list"+ user);
        }
        session.close();
        return userList;
    }

    @Override
    public User findById(Integer id) {
        Session session = sessionFactory.openSession();
        User user = session.load(User.class, id);
        if (user != null) {
            return null;
        }else{
            logger.info("User successfully loaded. info:" + user);

        }
        session.close();
        return user;

    }

    @Override
    public User findByName(String propertyName, Object value) {
        return null;
    }

    @Override
    public void update(User entity) {
        Session session = this.sessionFactory.openSession();
        session.update(entity);
        logger.info("User successfully  updated. User info "+ entity);
        session.close();
    }

    @Override
    public void save(User entity) {
        Session session = this.sessionFactory.openSession();
        session.persist(entity);
        logger.info("User successfully added . User info "+ entity);
        session.close();

    }
}
