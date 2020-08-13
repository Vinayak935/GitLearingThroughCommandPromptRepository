package com.ai.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Car implements ApplicationContextAware {

	private ApplicationContext applicationContext;
	
	
	public void drive()
	{
		Engine engine = applicationContext.getBean("engine",Engine.class);
		engine.start();
		System.out.println("driving on");
	}


	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       
		this.applicationContext =applicationContext;
	}
	
	 
}
