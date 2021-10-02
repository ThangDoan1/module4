package thang.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thang.demo.model.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value ="select * from form_user", nativeQuery = true)
    List<User> findAll();
}
