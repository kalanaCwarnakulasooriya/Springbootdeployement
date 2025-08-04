package lk.ijse.springbootdeployement.service.impl;

import lk.ijse.springbootdeployement.entity.Customer;
import lk.ijse.springbootdeployement.repo.CustomerRepository;
import lk.ijse.springbootdeployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
