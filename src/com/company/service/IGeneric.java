package com.company.service;

import java.util.List;

public interface IGeneric <T>{
    List<T> findAll();
    void save(T t);
    void deleteById(int id);
}
