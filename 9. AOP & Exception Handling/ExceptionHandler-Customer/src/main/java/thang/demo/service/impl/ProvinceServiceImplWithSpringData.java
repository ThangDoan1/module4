package thang.demo.service.impl;

import thang.demo.model.Province;
import thang.demo.repository.ProvinceRepository;
import thang.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ProvinceServiceImplWithSpringData implements ProvinceService {

    @Override
    public List<Province> findAll() {
        return null;
    }

    @Override
    public Province findOne(Long id) {
        return null;
    }

    @Override
    public Province save(Province Province) {
        return null;
    }

    @Override
    public List<Province> save(List<Province> Provinces) {
        return null;
    }

    @Override
    public boolean exists(Long id) {
        return false;
    }

    @Override
    public List<Province> findAll(List<Long> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void delete(Province Province) {

    }

    @Override
    public void delete(List<Province> Provinces) {

    }

    @Override
    public void deleteAll() {

    }
}
