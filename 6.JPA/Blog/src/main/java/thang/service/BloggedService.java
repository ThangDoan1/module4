package thang.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import thang.model.Blogged;
import java.util.List;

public interface BloggedService {
    List<Blogged> findAll();

    Blogged findById(Integer id) ;

    void save(Blogged blogged);

    void deleteById(Integer id);


}
