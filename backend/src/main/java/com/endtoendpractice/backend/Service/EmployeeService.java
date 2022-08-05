package com.endtoendpractice.backend.Service;

import com.endtoendpractice.backend.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public String employeeList(){
        Employee employee1 = new Employee("Abhishek", "abc@gmail.com");
        return employee1.toString();
    }
}
