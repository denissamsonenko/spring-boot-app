package by.project.customer.service;

import by.project.customer.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void deleteById(Long id);

    List<Customer> findAll();
}
