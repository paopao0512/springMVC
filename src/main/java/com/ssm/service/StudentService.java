package com.ssm.service;

import com.ssm.model.entity.Person;

import java.util.List;

public interface StudentService {
    Person queryId(int i) throws Exception;

    List<Person> queryName(String person) throws Exception;

    boolean addUser(Person person) throws Exception;

    boolean updateUser(Person user) throws Exception;

    boolean deleteUser(int i) throws Exception;

    boolean updateId(int id,Person person) throws Exception;

    List<Person> queryUser(Person person) throws Exception;
}