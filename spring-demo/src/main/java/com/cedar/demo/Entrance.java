package com.cedar.demo;

import com.cedar.demo.aop.TestAopBean;
import com.cedar.demo.aop.TestAopBeanService;
import com.cedar.demo.dto.MyTestBean;
import com.cedar.demo.service.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangnan
 * @date 2021/3/2 12:37
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan("com.cedar")
public class Entrance {


	public static void main1(String[] args) {
//		Resource resource = new ClassPathResource("spring/myTestBean.xml");
//
//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//
//		reader.loadBeanDefinitions(resource);
//
//
//		BeanDefinition myTestBean1 = beanFactory.getBeanDefinition("myTestBean");
//		String testStr = (String) myTestBean1.getAttribute("testStr");
//		System.out.println(testStr);
//
//		String description = myTestBean1.getDescription();
//		System.out.println(description);
//
//		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean", "String1111");
//		// 测试缓存
//		MyTestBean myTestBeanTwo = (MyTestBean) beanFactory.getBean("myTestBean", "String11112222");
//
//		System.out.println(myTestBean.getTestStr());
//		System.out.println(myTestBeanTwo.getTestStr());
//		myTestBean.printQualifier();
//
//
//		System.out.println("##########################################################################");
//
//		GetBeanTest getBeanTest = (GetBeanTest) beanFactory.getBean("getBeanTest");
//
//		getBeanTest.showMe();
//
//
//		System.out.println("##########################################################################");
//
//		TestChangeMethod testChangeMethod = (TestChangeMethod) beanFactory.getBean("testChangeMethod");
//		testChangeMethod.changeMe();
//
//
//		System.out.println("##########################################################################");
//
//		PropertiesTest propertiesTest = (PropertiesTest) beanFactory.getBean("propertiesTest");
//		System.out.println(propertiesTest.getNums());
//		System.out.println(propertiesTest.getTestStr());
//
//
//		System.out.println("##########################################################################");
//
//		UserBeanDefinition userBeanDefinition = (UserBeanDefinition) beanFactory.getBean("testId");
//		System.out.println(userBeanDefinition.getUserName());
//		System.out.println(userBeanDefinition.getEmail());
//
//
//		System.out.println("##########################################################################");
//
//		Car car = (Car) beanFactory.getBean("car");
//		System.out.println(car.getBrand());
//		System.out.println(car.getPrice());


		System.out.println("##############################ClassPathXmlApplicationContext############################################");
		System.out.println();
		System.out.println();
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/myTestBean.xml");
		MyTestBean myTestBean = (MyTestBean) applicationContext.getBean("myTestBean");
		myTestBean.printQualifier();


		System.out.println("##############################TestAopBean############################################");
		TestAopBean testAop = (TestAopBean) applicationContext.getBean("test");
		testAop.test();
	}


	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Entrance.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		for (String beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

		HelloService helloService = (HelloService) applicationContext.getBean("helloServiceImpl");
		String result = helloService.sayHello("张楠");
		System.out.println(result);


		TestAopBeanService testAopBean = (TestAopBeanService)applicationContext.getBean("testAopBean");
		testAopBean.test();
	}
}
