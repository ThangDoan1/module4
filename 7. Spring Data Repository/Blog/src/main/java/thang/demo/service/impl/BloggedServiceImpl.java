package thang.demo.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import thang.demo.model.Blogged;
import thang.demo.repository.BloggedRepository;
import thang.demo.service.BloggedService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class BloggedServiceImpl implements BloggedService {
    @Autowired
    private BloggedRepository bloggedRepository;

    @Override
    public Page<Blogged> findAll(Pageable pageable) {
        return bloggedRepository.findAll(pageable);
    }

    @Override
    public Blogged findById(Integer id) {
        return bloggedRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blogged blogged) {
        bloggedRepository.save(blogged);
    }

    @Override
    public void deleteById(Integer id) {
        bloggedRepository.deleteById(id);
    }

    @Override
    public Page<Blogged> findByTitle(String title, Pageable pageable) {
        return bloggedRepository.findByTitle(title,pageable);
    }

}


