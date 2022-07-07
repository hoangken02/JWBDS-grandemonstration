package com.kenit.springjparepositorycustomermanagement.service;


import com.kenit.springjparepositorycustomermanagement.model.Province;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void remove(Long id);
}
