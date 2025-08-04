package lk.ijse.gdse72.springboot_deployment.controller;

import lk.ijse.gdse72.springboot_deployment.dto.CustomerDTO;
import lk.ijse.gdse72.springboot_deployment.entity.Customer;
import lk.ijse.gdse72.springboot_deployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping("create")
    public String saveCustomer(@RequestBody Customer customerDTO) {
        customerService.saveCustomer(customerDTO);
        return "Customer saved successfully";
    }
}
