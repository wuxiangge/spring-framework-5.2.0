package com.cedar.demo.dto;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zhangnan
 * @date 2021/3/2 12:37
 */
public class MyTestBean {

	@Autowired
	private QualifierClazz qualifierClazz;

	private String testStr = "testStr";


	private List<String> constructors;

	private String[] strings;


	public MyTestBean(String testStr) {
		this.testStr = testStr;
	}


	public MyTestBean(QualifierClazz qualifierClazz, String testStr, List<String> constructors) {
		this.qualifierClazz = qualifierClazz;
		this.testStr = testStr;
		this.constructors = constructors;
	}

	public MyTestBean(List<String> constructors) {
		this.constructors = constructors;
	}

	public MyTestBean(String testStr, String... constructors) {
		this.strings = constructors;
		this.testStr = testStr;
	}

	public MyTestBean(QualifierClazz qualifierClazz, String testStr) {
		this.qualifierClazz = qualifierClazz;
		this.testStr = testStr;
	}

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String testStr) {
		this.testStr = testStr;
	}

	public void printQualifier() {
		qualifierClazz.printQualifier();
	}

	public QualifierClazz getQualifierClazz() {
		return qualifierClazz;
	}

	public void setQualifierClazz(QualifierClazz qualifierClazz) {
		this.qualifierClazz = qualifierClazz;
	}
}
