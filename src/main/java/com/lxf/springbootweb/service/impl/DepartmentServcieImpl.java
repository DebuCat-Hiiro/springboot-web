package com.lxf.springbootweb.service.impl;

import com.lxf.springbootweb.mapper.DepartmentMapper;
import com.lxf.springbootweb.pojo.Department;
import com.lxf.springbootweb.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hanamaru
 */
@Service
public class DepartmentServcieImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departMapper;

    @Override
    public List<Department> queryDeparts() {
        return departMapper.queryDeparts();
    }

    @Override
    public Department queryDepartById(int id) {
        return departMapper.queryDepartById(id);
    }
}
