package lk.ijse.gdse72.springboot_deployment.service.impl;

import lk.ijse.gdse72.springboot_deployment.dto.CustomerDTO;
import lk.ijse.gdse72.springboot_deployment.entity.Customer;
import lk.ijse.gdse72.springboot_deployment.repositiory.CustomerRepository;
import lk.ijse.gdse72.springboot_deployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveCustomer(Customer customerDTO) {
        if (customerDTO == null) {
            throw new IllegalArgumentException("CustomerDTO cannot be null");
        }
//        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customerRepository.save(customerDTO);
    }
}
