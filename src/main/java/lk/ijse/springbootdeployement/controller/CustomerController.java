package lk.ijse.springbootdeployement.controller;

import lk.ijse.springbootdeployement.entity.Customer;
import lk.ijse.springbootdeployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @GetMapping
    public String getCustomer(){
        return "Customer";
    }

    @PostMapping("/register")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }
}
