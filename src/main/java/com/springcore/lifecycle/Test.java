package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ci.Person;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
	//	Pricing p=(Pricing) context.getBean("s1");
	//	System.out.println(p);
		context.registerShutdownHook();
		
		Example example=(Example) context.getBean("example");
		System.out.println(example);
	}
}
