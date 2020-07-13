package com.cheba00.dao.interf;


import java.util.List;

/**
 * interface ICrudDao
 *
 *
 *
 */
public interface ICrudDao<T>{

    /**
     * this method is used for count row in database.
     *
     * @return long as a row count
     * */
    public long count();

    /**
     * This method is used for delete operation. Here this method first ensure
     * if the entity which we want to delete is instance of ideleteable or not.
     * if the entity is instaance of Ideleteable, it just perform delete
     * operation, if the entity is not instance of idelteable, it just change
     * the flag of boolean.
     *
     * @param id
     *            of an entity which we want to delete
     *
     * */
    public void delete(Integer id);

    /**
     * this method fetch all the entity which are visible and return as a list
     *
     * @return all the visible entity as list
     * */
    public List<T> findAll();

    /**
     * this method is used for find purpose. we can find entity using id. it
     * returns only visible entity
     *
     * @param id
     *            as long
     * @return the entity if it is found otherwise return null
     *
     * */
    public T findById(Integer id);

    /**
     * this is generic findBy method, we can find and entity by any of its
     * property we have to just provide the property name and the value of the
     * property by which we want to perform find operation
     *
     * @param propertyName
     *            the property name of in an entity, like if username is a
     *            property of user entity, we have to provide the name here as
     *            userName
     * @param value
     *            the value of this property by which we want to perform find
     *            operation
     * @return returns the entity if it is found
     * */

    public T findByName(String propertyName, Object value);



    /**
     * basic update operation
     *
     * @param entity
     *            the entity object
     * */
    public void update(T entity);


    /**
     * basic save operation
     *
     * @param entity
     *            the entity object
     * */
    public void save(T entity);

}


