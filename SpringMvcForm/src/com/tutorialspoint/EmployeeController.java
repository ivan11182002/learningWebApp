package com.tutorialspoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class EmployeeController {
	
//	@RequestMapping(value="/", method=RequestMethod.GET )
//	public ModelAndView employee(){
//		return new ModelAndView("emp_home", "springWeb", new Employee());
//	}
	@RequestMapping(method=RequestMethod.GET )
	public String employee(Map<String,Object> model){
		Employee employee = new Employee();
		model.put("empObj", employee);
		
		List<Integer> salOptions = new ArrayList<Integer>();
		salOptions.add(50000);
		salOptions.add(70000);
		salOptions.add(90000);
		model.put("salOptions", salOptions);
		
		return "emp_home";
	}
	
	@RequestMapping(value="/addEmp", method= RequestMethod.POST)
	public String addEmployee(@ModelAttribute("empObj")Employee emp, ModelMap model){
		model.addAttribute("empno", emp.getEmpno());
		model.addAttribute("ename", emp.getEname());
		model.addAttribute("job", emp.getJob());
		model.addAttribute("sal", emp.getSal());
		
		return "result";
	}
}
