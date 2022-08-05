package com.endtoendpractice.backend.Controller;

import com.endtoendpractice.backend.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeInfo {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public String getAllEmployeesInfo(){
        return employeeService.employeeList();
    }
}
