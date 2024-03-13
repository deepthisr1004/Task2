package com.ums.controller;

import com.ums.dto.EmployeeDto;
import com.ums.entity.Employee;
import com.ums.repository.IEmployee;
import com.ums.repository.IOfficeBranch;
import com.ums.entity.OfficeBranch;
import com.ums.response.ResponseModel;
import com.ums.service.EmployeeService;
import jakarta.validation.Valid;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;




@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/region")
    public ResponseEntity<List<String>> getEmployeesByRegion(@RequestParam String region) {
       List<String> employees = employeeService.getEmployeesByRegion(region);
      return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDto employee){
        Employee createdEmployee = employeeService.createEmployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }
}


