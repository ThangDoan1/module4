package thang.demo.repository;

import thang.demo.model.Province;
import org.springframework.data.repository.CrudRepository;

public interface ProvinceRepository extends CrudRepository<Province, Long> {
}
