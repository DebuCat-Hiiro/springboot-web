package com.lxf.springbootweb.mapper;

import com.lxf.springbootweb.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hanamaru
 */

@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> queryDeparts();
    Department queryDepartById(int id);
}
