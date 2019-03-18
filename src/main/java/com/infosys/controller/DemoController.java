package com.infosys.controller;

import com.infosys.service.EmployeeService;
import com.infosys.utilities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@RestController
public class DemoController{
    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/employees")
    public  Iterable<Employee> getEmployeeDetails() {
      return employeeService.findAll();


    }


}
