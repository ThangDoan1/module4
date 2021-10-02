package thang.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import thang.demo.model.Province;
import thang.demo.repository.ProvinceRepository;
import thang.demo.service.ProvinceService;

import java.util.Optional;
@Service
public class ProvinceServiceImpl  implements ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(Long id) {
        return provinceRepository.findById(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
//        provinceRepository.delete(id);
    }
}
