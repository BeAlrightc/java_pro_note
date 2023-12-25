package com.atguigu.rest.controller;

import com.atguigu.rest.bean.Employee;
import com.atguigu.rest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

@Controller
public class EmployeeController {
//自动注入属性
@Autowired
    private EmployeeDao employeeDao;
@RequestMapping(value="/employee",method= RequestMethod.GET)
public String getAllEmployee(Model model){
    Collection<Employee> employeeList = employeeDao.getAll();
    //使用model进行数据共享，将值共享到该页面当中
    model.addAttribute("employeeList",employeeList);
    return "employee_list";
  }

  @RequestMapping(value="/employee/{id}",method = RequestMethod.DELETE)
  public String deleteEmployee( @PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
   }
    @RequestMapping(value= "/employee", method = RequestMethod.POST)
   public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
   }
   //实现回显功能
   @RequestMapping(value= "/employee/{id}",method = RequestMethod.GET)
  public String getEmployeeById(@PathVariable("id") Integer id,Model model) {
       Employee employee = employeeDao.get(id);
       model.addAttribute("employee", employee);
       return "employee_update";
   }
   @RequestMapping(value="/employee",method=RequestMethod.PUT)
   public String updateEmployee(Employee employee){
        employeeDao.save(employee);
       return "redirect:/employee";
   }
}
