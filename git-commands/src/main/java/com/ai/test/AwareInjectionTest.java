package com.ai.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ai.beans.Bike;
import com.ai.beans.Car;

public class AwareInjectionTest {

	public static void main(String[] args) {
     
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ai/common/application-context.xml");
		
		Car car = context.getBean("car",Car.class);
		Bike bike = context.getBean("bike",Bike.class);
		  car.drive();
		  bike.drive();
	}

}
