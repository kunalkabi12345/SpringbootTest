
package com.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;

@RestController
public class SpringController {

	@GetMapping(path="/get-cust-info")
	public Customer customerInformation() 
	{
		Customer cust = new Customer();
		
		cust.setCustNo(2011);
		cust.setName("Jerome");
		cust.setCountry("United States");
		cust.setContactno(6512341019l);
		
		return cust;
	}
}


// URL: http://localhost:8080/springbootrestxml/get-cust-info
// URL: http://localhost:8080/springbootrestxml/get-cust-info.json