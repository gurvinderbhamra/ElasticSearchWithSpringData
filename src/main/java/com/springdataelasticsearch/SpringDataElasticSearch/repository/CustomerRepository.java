package com.springdataelasticsearch.SpringDataElasticSearch.repository;

import com.springdataelasticsearch.SpringDataElasticSearch.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    List<Customer> findByName(String name);
    Optional<Customer> findById(String id);
}
