package com.springdataelasticsearch.SpringDataElasticSearch.controller;

import com.springdataelasticsearch.SpringDataElasticSearch.model.Customer;
import com.springdataelasticsearch.SpringDataElasticSearch.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomer() {
        return customerService.findAllCustomer();
    }

    @GetMapping("/find-by-name/{name}")
    public List<Customer> findByName(@PathVariable final String name) {
        return customerService.findByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable final String id) {
        if (customerService.deleteCustomer(id))
            return new ResponseEntity<>(id, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
