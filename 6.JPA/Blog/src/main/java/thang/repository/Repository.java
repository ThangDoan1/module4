package thang.repository;

import thang.model.Blogged;

import java.util.List;

public interface Repository<T> {
    List<T> findAll();

    T findById(Integer id) ;

    void save(T model);

    void deleteById(Integer id);
}
