package com.capgemini.capstore.response;

import java.util.List;

import com.capgemini.capstore.bean.LoginBean;
import com.capgemini.capstore.bean.OrderBean;
import com.capgemini.capstore.bean.OrderHistoryBean;
import com.capgemini.capstore.bean.ProductBean;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CapstoreResponse {

	private int statusCode;
	private String message;
	private String description;
	private LoginBean loginbean;
	private List<LoginBean> loginlist;
	private List<OrderBean> orderList;
	private List<OrderHistoryBean> orderhistorybean;
	private ProductBean productBean;
	

	public ProductBean getProductBean() {
		return productBean;
	}

	public void setProductBean(ProductBean productBean) {
		this.productBean = productBean;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public List<OrderBean> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderBean> orderList) {
		this.orderList = orderList;
	}

	public List<OrderHistoryBean> getOrderhistorybean() {
		return orderhistorybean;
	}

	public void setOrderhistorybean(List<OrderHistoryBean> orderhistorybean) {
		this.orderhistorybean = orderhistorybean;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LoginBean getLoginbean() {
		return loginbean;
	}

	public void setLoginbean(LoginBean loginbean) {
		this.loginbean = loginbean;
	}

	public List<LoginBean> getLoginlist() {
		return loginlist;
	}

	public void setLoginlist(List<LoginBean> loginlist) {
		this.loginlist = loginlist;
	}

}
