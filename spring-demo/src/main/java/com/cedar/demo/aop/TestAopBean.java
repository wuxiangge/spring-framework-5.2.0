package com.cedar.demo.aop;

public class TestAopBean {

	private String id = "testAopBeanString";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void test() {
		System.out.println("test");
	}
}
