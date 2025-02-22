package com.capgemini.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.bean.LoginBean;
import com.capgemini.capstore.bean.OrderBean;
import com.capgemini.capstore.bean.OrderHistoryBean;
import com.capgemini.capstore.bean.ProductBean;
import com.capgemini.capstore.response.CapstoreResponse;
import com.capgemini.capstore.service.CustomerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(path = "/viewprofile")
	public CapstoreResponse viewprofile(@RequestParam String email) {

		LoginBean loginbean = customerService.viewprofile(email);
		CapstoreResponse capstoreResponse = new CapstoreResponse();
		if (loginbean != null) {
			capstoreResponse.setStatusCode(210);
			capstoreResponse.setMessage("success");
			capstoreResponse.setDescription("Customer details are...");
			capstoreResponse.setLoginbean(loginbean);

		} else {
			capstoreResponse.setStatusCode(401);
			capstoreResponse.setMessage("Failed");
			capstoreResponse.setDescription("unable to fetch the  profile!!!");
		}
		return capstoreResponse;
	}

	@PostMapping("/updateProfile")
	public CapstoreResponse updateProfile(@RequestBody LoginBean loginBean) {
		CapstoreResponse capstoreResponse = new CapstoreResponse();
		customerService.updateProfile(loginBean);
		if (loginBean != null) {
			capstoreResponse.setStatusCode(210);
			capstoreResponse.setMessage("sucess");
			capstoreResponse.setDescription("Information Updated Successfully");
		} else {
			capstoreResponse.setStatusCode(401);
			capstoreResponse.setMessage("failed");
			capstoreResponse.setDescription("Unable to update profile");
		}
		return capstoreResponse;
	}

	@GetMapping("/orderdetails")
	public CapstoreResponse orderdetails(@RequestParam String email) {
		List<OrderBean> orderList = customerService.orderdetails(email);
		CapstoreResponse capstoreResponse = new CapstoreResponse();
		capstoreResponse.setStatusCode(210);
		capstoreResponse.setMessage("success");
		capstoreResponse.setDescription("OrderList Found SuccessFul");
		capstoreResponse.setOrderList(orderList);
		return capstoreResponse;
	}
	
	@GetMapping("/orderHistory")
	public CapstoreResponse orderHistory(@RequestParam String email) {
		List<OrderHistoryBean> orderList = customerService.orderHistory(email);
		CapstoreResponse capstoreResponse = new CapstoreResponse();
		capstoreResponse.setStatusCode(210);
		capstoreResponse.setMessage("success");
		capstoreResponse.setDescription("OrderList Found SuccessFully");
		capstoreResponse.setOrderhistorybean(orderList);
		return capstoreResponse;
	}
}
