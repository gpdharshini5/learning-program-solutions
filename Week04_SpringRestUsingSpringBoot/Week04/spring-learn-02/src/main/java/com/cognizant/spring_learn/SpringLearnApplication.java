package com.cognizant.spring_learn;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {
	private static final Logger LOGGER = Logger.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.debug("Inside main()");
		displayCountry();
	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country : " + country);
	}
}

