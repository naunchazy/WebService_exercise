package client2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		WeatherInterface weatherInterface= (WeatherInterface) context.getBean("weatherClient2");
		String result = weatherInterface.queryWeather("±±¾©");
		System.out.println(result);
	}
}
