package com.cedar.demo;

import com.cedar.demo.lookup.GetBeanTest;
import com.cedar.demo.lookup.MyTestBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author zhangnan
 * @date 2021/3/2 12:37
 */
public class Entrance {


	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring/myTestBean.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

		reader.loadBeanDefinitions(resource);

		BeanDefinition myTestBean1 = beanFactory.getBeanDefinition("myTestBean");
		String testStr = (String) myTestBean1.getAttribute("testStr");
		System.out.println(testStr);

		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");

		System.out.println(myTestBean.getTestStr());


		System.out.println("##########################################################################");

		GetBeanTest getBeanTest = (GetBeanTest) beanFactory.getBean("getBeanTest");

		getBeanTest.showMe();

	}
}
