package com.lxf.springbootweb.controller;

import com.lxf.springbootweb.pojo.Department;
import com.lxf.springbootweb.pojo.Employee;
import com.lxf.springbootweb.service.DepartmentService;
import com.lxf.springbootweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;

/**
 * @author Hanamaru
 */
@Controller
public class EmployeeController {
    @Autowired
    EmployeeService empService;
    @Autowired
    private DepartmentService departService;

    @GetMapping("/emps")
    public String getEmployees(Model model){
        List<Employee> employees = empService.getEmployees();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    /**
     * 跳转到添加用户界面
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String toAddPage(Model model){
        //获取所有部门信息
        Collection<Department> departments = departService.queryDeparts();
        model.addAttribute("depts",departments);
        return "emp/add";
    }

    @PostMapping("/addEmp")
    public String addEmp(Employee employee){
        //添加员工信息
        empService.addEmployee(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{empId}")
    public String toUpdateEmp(@PathVariable()Integer empId, Model model){
        Employee employee = empService.getEmployee(empId);
        model.addAttribute("emp",employee);

        Collection<Department> departments = departService.queryDeparts();
        model.addAttribute("departs",departments);

        return "emp/update";
    }
    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        empService.updateEmployee(employee);
        return "redirect:/emps";
    }

    @GetMapping("/deleteEmp/{empId}")
    public String deleteEmp(@PathVariable("empId")Integer empId){
        empService.deleteEmployee(empId);
        return "redirect:/emps";
    }
}
