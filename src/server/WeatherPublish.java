package server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
//CXF����SOAPЭ��ķ���
public class WeatherPublish {
	//��JaxWsServerFactoryBean������������3��������1.����ӿڣ�2.����ʵ���ࣻ3.�����ַ��
	public static void main(String[] args) {
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setServiceClass(WeatherInterface.class);
		factoryBean.setServiceBean(new WeatherInterfaceImpl());
		factoryBean.setAddress("http://localhost:8088/weather");
		factoryBean.create();
		System.out.println("�����ɹ�");
		//����http://localhost:8088/weather?wsdl����֪����û�з����ɹ�
	}

}
