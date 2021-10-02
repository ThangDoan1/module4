package thang.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thang.demo.model.Customer;
import thang.demo.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);

}
