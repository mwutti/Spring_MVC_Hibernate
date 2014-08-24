package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Administrator on 24.08.2014.
 */
@Repository("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @Override
    public Employee persistEmployee(Employee employee) {
        sessionFactory.getCurrentSession().persist(employee);
        return employee;
    }

    @Transactional
    @Override
    public Employee findEmployeeById(Long id) {

        return (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
    }
    @Transactional
    @Override
    public Employee updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
        return employee;
    }
    @Transactional
    @Override
    public Employee deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
        return employee;
    }
}
