package com.springapp.mvc.service;

import com.springapp.mvc.dao.EmployeeDAO;
import com.springapp.mvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 24.08.2014.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDao;

    @Override
    public Employee findEmployeeById(String id) {
       return employeeDao.findEmployeeById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public Employee deleteEmployee(Employee employee) {
        return employeeDao.deleteEmployee(employee);
    }

    @Override
    public Employee persistEmployee(Employee employee) {
        return employeeDao.persistEmployee(employee);
    }
}
