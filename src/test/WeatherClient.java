package test;

import webservice_exercise2.WeatherInterfaceImpl;
import webservice_exercise2.WeatherInterfaceImplService;

//ʹ�ÿͻ��˴�����÷�����ṩ�ķ���
public class WeatherClient {

	public static void main(String[] args) {
		//1.����������ͼ
		WeatherInterfaceImplService weatherInterfaceImplService
		=new WeatherInterfaceImplService();
		//2.��ȡ����ʵ����
		WeatherInterfaceImpl port 
		= weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
		//3.���ò�ѯ��������ӡ
		String result = port.queryWeather("����");
//		String result = port.queryWeather("�Ϻ�");
		System.out.println(result);
	}
}
