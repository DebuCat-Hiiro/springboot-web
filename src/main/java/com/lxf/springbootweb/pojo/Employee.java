package com.lxf.springbootweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author Hanamaru
 * 员工表
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer empId;
    private String empName;
    private String email;
    private Integer gender;
    private Department department;
    private Date birth;

    /*public Employee(Integer empId, String empName, String email, Integer gender, Department department) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }*/
}
