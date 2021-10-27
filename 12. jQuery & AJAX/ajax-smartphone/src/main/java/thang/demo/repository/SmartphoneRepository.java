package thang.demo.repository;

import org.springframework.data.repository.CrudRepository;
import thang.demo.model.entity.Smartphone;

public interface SmartphoneRepository extends CrudRepository<Smartphone,Integer> {


}
