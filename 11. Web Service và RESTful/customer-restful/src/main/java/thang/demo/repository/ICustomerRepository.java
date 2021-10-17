package thang.demo.repository;

import java.util.List;

public interface ICustomerRepository<T> {
    List<T> findAll();

    T findById(Long id);

    void save(T model);

    void remove(Long id);
}
