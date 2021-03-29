package com.lxf.springbootweb.mapper;

import com.lxf.springbootweb.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hanamaru
 */
@Mapper
@Repository
public interface EmployeeMapper {

    /**
     * 获取所有员工信息
     * @return list
     */
    List<Employee> getEmployees();

    /**
     * 根据id获取员工信息
     * @param id
     * @return employee
     */
    Employee getEmployee(Integer id);

    /**
     * 添加员工信息
     * @param employee
     */
    void addEmployee(Employee employee);

    /**
     * 修改员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 根据id删除员工信息
     * @param id
     */
    void deleteEmployee(Integer id);
}
