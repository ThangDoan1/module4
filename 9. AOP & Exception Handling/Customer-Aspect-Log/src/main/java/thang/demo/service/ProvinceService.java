package thang.demo.service;

import thang.demo.model.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();

    Province findById(Long id);

    Province save(Province Province);

//    List<Province> save(List<Province> Provinces);

//    boolean exists(Long id);

//    List<Province> findAll(List<Long> ids);

    long count();

//    void delete(Long id);

    void delete(Province Province);

//    void delete(List<Province> Provinces);

    void deleteAll();
}
