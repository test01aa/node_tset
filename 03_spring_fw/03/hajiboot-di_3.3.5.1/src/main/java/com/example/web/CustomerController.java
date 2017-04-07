package com.example.web;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@ModelAttribute
	CustomerForm setUpForm(){
		return new CustomerForm();
	}
	
	@GetMapping
	String list(Model model){
		List<Customer> customers = customerService.findAll();
		model.addAttribute("customers" , customers);
		return "customers/list";
	}
	
	
}
