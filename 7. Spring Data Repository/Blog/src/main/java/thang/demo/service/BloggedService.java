package thang.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thang.demo.model.Blogged;
import java.util.List;

public interface BloggedService {
    Page<Blogged> findAll(Pageable pageable);

    Blogged findById(Integer id) ;

    void save(Blogged blogged);

    void deleteById(Integer id);

    Page<Blogged> findByTitle(String title , Pageable pageable);
}
