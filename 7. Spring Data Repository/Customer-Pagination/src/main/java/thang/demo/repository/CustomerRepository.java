package thang.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import thang.demo.model.Customer;
import thang.demo.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
    Iterable<Customer> findAllByProvince(Province province);
    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
