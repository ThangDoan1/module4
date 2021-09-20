package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customers;
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers);
    }
}
