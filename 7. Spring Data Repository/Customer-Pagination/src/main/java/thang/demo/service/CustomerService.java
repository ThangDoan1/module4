package thang.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thang.demo.model.Customer;
import thang.demo.model.Province;

import java.util.Optional;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Optional<Customer> findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Optional<Province> province);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
