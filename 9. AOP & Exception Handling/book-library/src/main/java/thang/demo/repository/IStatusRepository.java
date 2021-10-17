package thang.demo.repository;


import thang.demo.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatusRepository extends JpaRepository<Status, Integer> {
}
