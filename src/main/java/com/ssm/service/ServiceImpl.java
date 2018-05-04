package com.ssm.service;

import com.ssm.dao.Dao;
import com.ssm.model.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpl implements StudentService {
    @Autowired
    Dao dao;
    @Override
    public List<Person> queryName(String person) {
        return dao.findUserByName(person);
    }
    @Override
    public boolean addUser(Person person) {
        return dao.addUser(person);
    }
    @Override
    public Person queryId(int id){
        return dao.findUserById(id);
    }
    @Override
    public boolean deleteUser(int id){
        return dao.deleteUser(id);
    }
    @Override
    public boolean updateUser(Person person){
        return dao.updateUser(person);
    }
    @Override
    public boolean updateId(int id,Person person) {
        person.setId(id);
        return dao.updateUser(person);
    }
    @Override
    public List<Person> queryUser(Person person){
        return dao.findUser(person);
    }
}