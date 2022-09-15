package com.akhm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeaFactoryTest {

	public static void main(String[] args) {
		
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		Student student=(Student)factory.getBean("student");
		
		
		
		
	}
}
