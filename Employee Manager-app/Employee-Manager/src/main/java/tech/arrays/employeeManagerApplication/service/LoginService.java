package tech.arrays.employeeManagerApplication.service;

import tech.arrays.employeeManagerApplication.model.Login;

public interface LoginService {
    public boolean findUser(Login login);
    public Login addUser(Login login);
}
