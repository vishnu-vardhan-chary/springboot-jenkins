package com.sample.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sample.entity.Employee;

@Controller
public class SampleController {

	@GetMapping("/")
	public String display(Model model) {
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1L,"vishnu",23));
		emp.add(new Employee(2L,"chary",22));
		emp.add(new Employee(3L,"rohith",21));
		emp.add(new Employee(4L,"ranjith",28));
		
		model.addAttribute("name", "Employees");
		
		model.addAttribute("employee", emp);
		
		return "display";
	}
}
