package com.springapp.mvc;

import com.springapp.mvc.model.Employee;
import com.springapp.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        Employee emp = new Employee();
        emp.setAge(12);
        emp.setName("Juno");
        employeeService.persistEmployee(emp);

		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}