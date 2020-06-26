package com.win.payrollproject.EmployeeRepository;

import com.win.payrollproject.Employee.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}