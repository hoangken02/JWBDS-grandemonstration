package com.kenit.springjparepositorycustomermanagement.service.impl;


import com.kenit.springjparepositorycustomermanagement.model.Customer;
import com.kenit.springjparepositorycustomermanagement.model.Province;
import com.kenit.springjparepositorycustomermanagement.repository.CustomerRepository;
import com.kenit.springjparepositorycustomermanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> findAll(Pageable pageable) throws Exception {
        if (true)
            throw new Exception("a dummy exception");

        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findById(Long id) throws Exception {
        Customer target = customerRepository.findOne(id);
        if (target == null){
            throw new Exception("customer not found");
        }
        return target;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<Customer> findAllByProvince(Province province) {
        return null;
    }

    @Override
    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
        return null;
    }
}
