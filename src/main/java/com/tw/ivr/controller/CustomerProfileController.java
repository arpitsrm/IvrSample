package com.tw.ivr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerProfileController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public Object sendSMSSessionLink(@RequestParam(value = "phoneNumber", required = true) Long phoneNumber) {
		return "hello";
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
