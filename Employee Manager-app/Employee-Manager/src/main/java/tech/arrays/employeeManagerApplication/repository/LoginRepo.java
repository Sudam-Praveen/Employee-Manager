package tech.arrays.employeeManagerApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arrays.employeeManagerApplication.model.Login;

public interface  LoginRepo extends JpaRepository<Login,Long> {
}
