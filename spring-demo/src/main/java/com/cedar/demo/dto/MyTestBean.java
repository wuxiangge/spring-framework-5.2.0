package com.cedar.demo.dto;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhangnan
 * @date 2021/3/2 12:37
 */
public class MyTestBean {

	@Autowired
	private QualifierClazz qualifierClazz;

	private String testStr = "testStr";

	public MyTestBean(String testStr) {
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
