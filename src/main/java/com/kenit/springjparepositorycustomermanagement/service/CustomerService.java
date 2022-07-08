package com.kenit.springjparepositorycustomermanagement.service;


import com.kenit.springjparepositorycustomermanagement.model.Customer;
import com.kenit.springjparepositorycustomermanagement.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable) throws Exception;

    Customer findById(Long id) throws Exception;

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
