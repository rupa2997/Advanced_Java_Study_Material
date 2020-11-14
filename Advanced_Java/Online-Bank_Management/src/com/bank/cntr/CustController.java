package com.bank.cntr;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.dto.Customer;
import com.bank.service.CustService;

@Controller
public class CustController {
	@Autowired
	private CustService custService;
	
	@RequestMapping(value="/pre_reg_form.htm" , method=RequestMethod.GET)
	public String preRegForm(ModelMap map) {
		map.put("cust", new Customer());
		return "Reg_form";
		
	}
	
	@RequestMapping(value="/reg.htm" , method=RequestMethod.POST)
	public String register(Customer cust,ModelMap map) {
		custService.addCust(cust);
		return "index";
		
	}
	
	@RequestMapping(value="/pre_log_form.htm" , method=RequestMethod.GET)
	public String preLogForm(ModelMap map) {
		map.put("cust", new Customer());
		return "login";
		
	}
	
	@RequestMapping(value="/login.htm" , method=RequestMethod.POST)
	public String login(Customer cust,ModelMap map,HttpSession session) {
		boolean b=custService.findCust(cust);
		if(b) {
			session.setAttribute("cust", cust);
			return "home";
		}else {
			return "login";
		}
		
	}
	@RequestMapping(value="/checkAmt.htm" , method=RequestMethod.GET)
	public String chkAmt(Customer cust,ModelMap map) {
		map.put("cust", cust);
		return "checkAmt";
		
	}


}
