package client1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//CXF+Spring���Ϸ���SOAP�ķ���
public class test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
		WeatherInterface weatherInterface=(WeatherInterface) context.getBean("weatherClient1");
		String result = weatherInterface.queryWeather("����");
		System.out.println(result);
	}
}
