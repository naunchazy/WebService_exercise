package server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
//CXF发布SOAP协议的服务
public class WeatherPublish {
	//用JaxWsServerFactoryBean发布服务，设置3个参数，1.服务接口；2.服务实现类；3.服务地址；
	public static void main(String[] args) {
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setServiceClass(WeatherInterface.class);
		factoryBean.setServiceBean(new WeatherInterfaceImpl());
		factoryBean.setAddress("http://localhost:8088/weather");
		factoryBean.create();
		System.out.println("发布成功");
		//访问http://localhost:8088/weather?wsdl即可知道有没有发布成功
	}

}
