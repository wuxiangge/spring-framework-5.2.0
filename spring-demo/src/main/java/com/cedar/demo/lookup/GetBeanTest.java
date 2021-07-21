package com.cedar.demo.lookup;

/**
 * @author zhangnan
 * @date 2021/3/2 13:14
 */
public abstract class GetBeanTest {

	public void showMe() {
		getBean().showMe();
	}

	public abstract User getBean();

}
