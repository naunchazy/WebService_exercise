package client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
//�ͻ���ʹ��CXF������SOAPЭ�����
public class test1 {

	public static void main(String[] args) {
	JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
	// ���÷���ӿ�
	factoryBean.setServiceClass(WeatherInterface.class);
	// ���÷����ַ
	factoryBean.setAddress("http://localhost:8088/weather");
	// ��ȡ����ӿ�ʵ��
	WeatherInterface weatherInterface = factoryBean.create(WeatherInterface.class);
	// ���ò�ѯ����
	String result = weatherInterface.queryWeather("�Ϻ�");
	System.out.println(result);
	}

}
