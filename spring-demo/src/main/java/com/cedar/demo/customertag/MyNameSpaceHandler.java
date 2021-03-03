package com.cedar.demo.customertag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author zhangnan
 * @date 2021/3/3 16:51
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {

	/**
	 * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after
	 * construction but before any custom elements are parsed.
	 *
	 * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
	 */
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
	}
}
