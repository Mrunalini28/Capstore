package com.capgemini.capstore.service;

import java.util.List;

import com.capgemini.capstore.bean.LoginBean;
import com.capgemini.capstore.bean.OrderBean;
import com.capgemini.capstore.bean.OrderHistoryBean;
import com.capgemini.capstore.bean.ProductBean;

public interface CustomerService {

	public LoginBean viewprofile(String email);
	
	public boolean updateProfile(LoginBean loginBean) ;
	
	public List<OrderBean> orderdetails(String email);
	
	public List<OrderHistoryBean> orderHistory(String email);
	
}