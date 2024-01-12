package tech.arrays.employeeManagerApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import tech.arrays.employeeManagerApplication.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    Optional<Employee> findEmployeeById(Long id);
}
