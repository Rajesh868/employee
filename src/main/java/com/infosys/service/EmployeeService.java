package com.infosys.service;

import com.infosys.utilities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeService extends CrudRepository<Employee,String> {
}
