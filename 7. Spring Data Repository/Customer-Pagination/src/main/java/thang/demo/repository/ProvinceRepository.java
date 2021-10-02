package thang.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import thang.demo.model.Province;

public interface ProvinceRepository extends PagingAndSortingRepository<Province,Long> {
}
