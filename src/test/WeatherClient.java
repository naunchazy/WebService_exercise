package test;

import webservice_exercise2.WeatherInterfaceImpl;
import webservice_exercise2.WeatherInterfaceImplService;

//使用客户端代码调用服务端提供的服务
public class WeatherClient {

	public static void main(String[] args) {
		//1.创建服务视图
		WeatherInterfaceImplService weatherInterfaceImplService
		=new WeatherInterfaceImplService();
		//2.获取服务实现类
		WeatherInterfaceImpl port 
		= weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//3.调用查询方法，打印
		String result = port.queryWeather("杭州");
//		String result = port.queryWeather("上海");
		System.out.println(result);
	}
}
