package com.springdataelasticsearch.SpringDataElasticSearch.service;

import com.springdataelasticsearch.SpringDataElasticSearch.model.Customer;
import com.springdataelasticsearch.SpringDataElasticSearch.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    public Iterable<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    public List<Customer> findByName(@PathVariable final String name) {
        return customerRepository.findByName(name);
    }

    public boolean deleteCustomer(String id) {
        Customer customer = customerRepository.findById(id).orElse(null);
        if (customer == null) return false;
        customerRepository.delete(customer);
        return true;
    }
}
