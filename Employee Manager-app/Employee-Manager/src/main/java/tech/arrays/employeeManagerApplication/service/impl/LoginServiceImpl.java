package tech.arrays.employeeManagerApplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.arrays.employeeManagerApplication.model.Login;
import tech.arrays.employeeManagerApplication.repository.LoginRepo;
import tech.arrays.employeeManagerApplication.service.LoginService;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginRepo loginRepo;
    public Login addUser(Login login) {

        return loginRepo.save(login);
    }

    @Override
    public boolean findUser(Login login) {
        List<Login> allUseers = loginRepo.findAll();
        for (Login user:allUseers) {
            if(login.getEmail().equalsIgnoreCase(user.getEmail())
                    && login.getPassword().equalsIgnoreCase(user.getPassword()) ){
                return true;
            }

        }

        return false;
    }

}
