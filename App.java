package com.CH22_SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("configSpringTest.xml");
		Student student1=context.getBean("stu1",Student.class);
		System.out.println(student1);
	}

}
