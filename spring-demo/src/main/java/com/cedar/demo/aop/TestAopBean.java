package com.cedar.demo.aop;

import org.springframework.stereotype.Component;

@Component
public class TestAopBean implements TestAopBeanService{

	private String id = "testAopBeanString";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public void test() {
		System.out.println("test");
	}
}
