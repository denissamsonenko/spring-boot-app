package by.project.customer.controller;

import by.project.customer.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/customers/")
public interface CustomerController {

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id);

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Customer> save(@RequestBody Customer customer);

    @PutMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer);

    @DeleteMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Customer> deleteCustomer(@PathVariable("id") Long id);

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Customer>> getAllCustomers();
}
