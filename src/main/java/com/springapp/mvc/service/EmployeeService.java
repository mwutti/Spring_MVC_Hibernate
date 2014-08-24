package com.springapp.mvc.service;

import com.springapp.mvc.model.Employee;

/**
 * Created by Administrator on 24.08.2014.
 */
public interface EmployeeService {
    Employee findEmployeeById(Long id);

    Employee updateEmployee(Employee employee);

    Employee deleteEmployee(Employee employee);

    Employee persistEmployee(Employee employee);
}
