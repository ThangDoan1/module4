package thang.demo.service;

import thang.demo.model.Customer;
import thang.demo.model.Province;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Optional<Province> province);
}
