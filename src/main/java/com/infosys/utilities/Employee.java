package com.infosys.utilities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.security.PrivateKey;
@Entity
public class Employee {
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empID=" + empID +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }

    public Employee(String empName, int empID, String empDepartment) {
        this.empName = empName;
        this.empID = empID;
        this.empDepartment = empDepartment;
    }

    public Employee() {

    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

private    String empName;
    @Id
    private  int empID;
    private String empDepartment;

}
