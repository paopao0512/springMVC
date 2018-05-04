package com.ssm.dao;

import com.ssm.model.entity.Person;

import java.util.List;

public interface Dao {
    boolean addUser (Person person);
    boolean updateUser (Person user);
    boolean deleteUser (int id);
    List<Person> findUserByName (String user);
    Person findUserById (int id);
    List<Person> findUser(Person person);
}