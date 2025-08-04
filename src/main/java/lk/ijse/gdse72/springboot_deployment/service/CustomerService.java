package lk.ijse.gdse72.springboot_deployment.service;

import lk.ijse.gdse72.springboot_deployment.dto.CustomerDTO;
import lk.ijse.gdse72.springboot_deployment.entity.Customer;

public interface CustomerService {
    void saveCustomer(Customer customerDTO);
}
