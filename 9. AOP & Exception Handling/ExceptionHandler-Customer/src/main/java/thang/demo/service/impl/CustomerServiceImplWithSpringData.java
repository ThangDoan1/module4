package thang.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import thang.demo.exception.DuplicateEmailException;
import thang.demo.model.entity.Customer;
import thang.demo.repository.CustomerRepository;
import thang.demo.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CustomerServiceImplWithSpringData implements CustomerService {
    @Autowired
    CustomerRepository customerRepository ;

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
    public Customer save(Customer customer) throws DuplicateEmailException {
        try {
            return customerRepository.save(customer);
        } catch (DataIntegrityViolationException e) {
            throw new DuplicateEmailException();
        }
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
