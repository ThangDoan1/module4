package thang.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import thang.demo.model.Blogged;

public interface BloggedRepository extends JpaRepository<Blogged, Integer> {
    @Query(value ="select * from  blog where title like %?1%",nativeQuery = true)
        Page<Blogged> findByTitle(String title , Pageable pageable);

    @Query(value = "select * from blog", nativeQuery = true)
    Page<Blogged> findAll(Pageable pageable);


}
