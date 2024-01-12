package tech.arrays.employeeManagerApplication.service;

import tech.arrays.employeeManagerApplication.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public List<Employee> findAllEmployees();
    public Employee updateEmployee(Employee employee);
    public void deleteEmployee(Long id);
    public Employee findEmployeeById(Long id);
}
