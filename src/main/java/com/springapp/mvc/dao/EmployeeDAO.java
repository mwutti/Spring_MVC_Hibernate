package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;
/**
 * Created by Administrator on 24.08.2014.
 */

public interface EmployeeDAO {
    Employee persistEmployee(Employee employee);

    Employee findEmployeeById(Long id);

    Employee updateEmployee(Employee employee);

    Employee deleteEmployee(Employee employee);
}

