package thang.demo.service.impl;

import thang.demo.model.entity.Customer;
import thang.demo.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CustomerServiceImplWithSpringData implements CustomerService {

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Page<Customer> findAll(Pageable pageInfo) {
        return null;
    }

    @Override
    public List<Customer> search(String keyword) {
        return null;
    }

    @Override
    public Page<Customer> search(String keyword, Pageable pageInfo) {
        return null;
    }

    @Override
    public Customer findOne(Long id) {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<Customer> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Customer customer) {

    }

    @Override
    public void delete(List<Customer> customers) {

    }

    @Override
    public void deleteAll() {

    }
}