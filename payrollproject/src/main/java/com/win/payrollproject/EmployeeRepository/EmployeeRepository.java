package com.win.payrollproject.EmployeeRepository;

import com.win.payrollproject.Employee.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}