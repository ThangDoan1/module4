package thang.demo.service;

import thang.demo.model.entity.Smartphone;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();

    Smartphone findById(Integer var1);

    Smartphone save(Smartphone var1);

    Smartphone remove(Integer var1);
}
