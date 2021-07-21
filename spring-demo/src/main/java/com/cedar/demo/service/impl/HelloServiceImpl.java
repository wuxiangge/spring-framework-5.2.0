package com.cedar.demo.service.impl;

import com.cedar.demo.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhangnan
 * @date 2021/4/1 17:28
 */
@Service
public class HelloServiceImpl implements HelloService {


	@Override
	public String sayHello(String name) {
		return "Hi " + name;
	}
}
