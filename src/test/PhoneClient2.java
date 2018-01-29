package test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import client1.MobileCodeWSSoap;


/**��������ʹ��JDK�ṩService��ʵ��
 * ��������ʹ�õ��ǹ��������ַ�ṩ�ĺ�������ز�ѯ
 * ���У�ֻʹ�����Զ����ɵĿͻ��˴���client1�е�MobileCodeWSSoap��.
 */
public class PhoneClient2 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		/*
		 * ����QNAME
		 * ����1:�����ռ䣺targetNamespace����
		 * ����2:<wsdl:service name="MobileCodeWS">,�ӿ�ʵ����
		 */
		QName qName = new QName("http://WebXml.com.cn/","MobileCodeWS");
		//����Service����
		Service service=Service.create(url,qName);
		MobileCodeWSSoap port = service.getPort(MobileCodeWSSoap.class);
		String mobileCode="15889323532";
		String userID=null;
		String result = port.getMobileCodeInfo(mobileCode, userID);
		System.out.println(result);
	}
}
