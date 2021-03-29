package com.lxf.springbootweb.service;

import com.lxf.springbootweb.pojo.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> queryDeparts();
    Department queryDepartById(int id);
}
