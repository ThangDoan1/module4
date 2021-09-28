package thang.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thang.model.Blogged;
import thang.repository.BloggedRepository;
import thang.service.BloggedService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BloggedServiceImpl implements BloggedService {
    @Autowired
    private BloggedRepository bloggedRepository;

    @Override
    public List<Blogged> findAll() {
        return bloggedRepository.findAll();
    }

    @Override
    public Blogged findById(Integer id) {
        return bloggedRepository.findById(id);
    }

    @Override
    public void save(Blogged blogged) {
        bloggedRepository.save(blogged);
    }

    @Override
    public void deleteById(Integer id) {
        bloggedRepository.deleteById(id);
    }



}


