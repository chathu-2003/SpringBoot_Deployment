package lk.ijse.gdse72.springboot_deployment.repositiory;

import lk.ijse.gdse72.springboot_deployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
