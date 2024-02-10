package tech.arrays.employeeManagerApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.arrays.employeeManagerApplication.model.Employee;
import tech.arrays.employeeManagerApplication.model.Login;
import tech.arrays.employeeManagerApplication.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PutMapping("/check")
    public ResponseEntity<String> updateEmployee(@RequestBody Login login){
       if( loginService.findUser(login)) {
           return new ResponseEntity<>("Valid User", HttpStatus.OK);
       }
        return new ResponseEntity<>("Invalid User", HttpStatus.NOT_ACCEPTABLE);

    }
    @PostMapping("/add")
    public ResponseEntity<Login> addUser(@RequestBody Login login){
        Login newUser = loginService.addUser(login);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
