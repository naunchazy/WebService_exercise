package client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
//客户端使用CXF发布的SOAP协议服务
public class test1 {

	public static void main(String[] args) {
	JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
	// 设置服务接口
	factoryBean.setServiceClass(WeatherInterface.class);
	// 设置服务地址
	factoryBean.setAddress("http://localhost:8088/weather");
	// 获取服务接口实例
	WeatherInterface weatherInterface = factoryBean.create(WeatherInterface.class);
	// 调用查询方法
	String result = weatherInterface.queryWeather("上海");
	System.out.println(result);
	}

}
