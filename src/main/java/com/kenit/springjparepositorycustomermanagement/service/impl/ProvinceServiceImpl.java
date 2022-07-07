package com.kenit.springjparepositorycustomermanagement.service.impl;

import com.kenit.springjparepositorycustomermanagement.model.Province;
import com.kenit.springjparepositorycustomermanagement.repository.ProvinceRepository;
import com.kenit.springjparepositorycustomermanagement.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public Iterable<Province> findAll() {
        return provinceRepository.findAll();
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findOne(id);
    }

    @Override
    public void save(Province province) {
        provinceRepository.save(province);
    }

    @Override
    public void remove(Long id) {
        provinceRepository.delete(id);
    }
}
