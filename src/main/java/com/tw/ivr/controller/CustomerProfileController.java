package com.tw.ivr.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.voxeo.tropo.Tropo;

@Controller
public class CustomerProfileController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public Object sendSMSSessionLink() {
		return "hello";
	}
	
	@RequestMapping(value = "/ivr", method = RequestMethod.GET)
	@ResponseBody
	public void ivr(HttpServletResponse response) {
		Tropo tropo = new Tropo();
		tropo.say("Hello, How are you.","hello");
		tropo.render(response);
	}
		
	
	/*@Autowired
	public CustomerProfileService customerProfileService;

	@RequestMapping(value = "/sendSMSSessionLink", method = RequestMethod.GET)
	@ResponseBody
	public Object sendSMSSessionLink(@RequestParam(value = "phoneNumber", required = true) Long phoneNumber) {
		CustomerResponse customerResponse;
		String smsSessionLink = "";
		Customer customer = customerProfileService.getCustomerProfile(phoneNumber);
		if (customer == null){
			customerResponse = new CustomerResponse();
			customerResponse.setResponseCode(1);
			customerResponse.setResponseMessage("Customer record does not exist");
			return customerResponse;
		}
		else {
			Boolean isProfileQualified = customerProfileService.isProfileQualified(customer);
			if (!isProfileQualified) {
				customerResponse = new CustomerResponse();
				customerResponse.setResponseCode(2);
				customerResponse.setResponseMessage("Customer is not qualified to receive SMS link");
				return customerResponse;
			} else {
				smsSessionLink = customerProfileService.sendSMSSessionLink(customer);
				customerResponse = new CustomerResponse();
				customerResponse.setResponseCode(200);
				customerResponse.setResponseMessage(smsSessionLink);
				return customerResponse;
			}
		}
	}
	*/
	
}
