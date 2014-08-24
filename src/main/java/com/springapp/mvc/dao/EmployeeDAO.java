package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 24.08.2014.
 */

public interface EmployeeDAO {
    Employee persistEmployee(Employee employee);

    Employee findEmployeeById(String id);

    Employee updateEmployee(Employee employee);

    Employee deleteEmployee(Employee employee);
}

