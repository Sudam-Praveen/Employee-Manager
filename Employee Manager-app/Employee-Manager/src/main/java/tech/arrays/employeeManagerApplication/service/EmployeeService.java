package tech.arrays.employeeManagerApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.arrays.employeeManagerApplication.exception.UserNotFoundException;
import tech.arrays.employeeManagerApplication.model.Employee;
import tech.arrays.employeeManagerApplication.repository.EmployeeRepo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepo.save(employee);
    }
    public void deleteEmployee(Long id){
        Optional<Employee> employee = employeeRepo.findById(id);
        if(employee.isPresent()){
            employeeRepo.deleteById(id);
        }

    }
    public Optional<Employee> findEmoployeeById(Long id){

        return Optional.ofNullable(employeeRepo.findEmployeeById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found")));
    }
}
