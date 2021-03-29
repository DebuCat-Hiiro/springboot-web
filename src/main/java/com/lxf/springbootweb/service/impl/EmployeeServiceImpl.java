package com.lxf.springbootweb.service.impl;

import com.lxf.springbootweb.mapper.EmployeeMapper;
import com.lxf.springbootweb.pojo.Employee;
import com.lxf.springbootweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hanamaru
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper empMapper;

    @Override
    public List<Employee> getEmployees() {
        return empMapper.getEmployees();
    }

    @Override
    public Employee getEmployee(Integer id) {
        return empMapper.getEmployee(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        empMapper.addEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        empMapper.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Integer id) {
        empMapper.deleteEmployee(id);
    }
}
