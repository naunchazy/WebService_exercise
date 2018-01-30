package client1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//CXF+Spring整合发布SOAP的服务
public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		WeatherInterface weatherInterface=(WeatherInterface) context.getBean("weatherClient1");
		String result = weatherInterface.queryWeather("杭州");
		System.out.println(result);
	}
}
