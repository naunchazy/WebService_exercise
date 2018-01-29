package test;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import client1.MobileCodeWSSoap;


/**方法二：使用JDK提供Service类实现
 * 服务器端使用的是公网服务地址提供的号码归属地查询
 * 其中，只使用了自动生成的客户端代码client1中的MobileCodeWSSoap类.
 */
public class PhoneClient2 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		/*
		 * 设置QNAME
		 * 参数1:命名空间：targetNamespace属性
		 * 参数2:<wsdl:service name="MobileCodeWS">,接口实现类
		 */
		QName qName = new QName("http://WebXml.com.cn/","MobileCodeWS");
		//创建Service对像
		Service service=Service.create(url,qName);
		MobileCodeWSSoap port = service.getPort(MobileCodeWSSoap.class);
		String mobileCode="15889323532";
		String userID=null;
		String result = port.getMobileCodeInfo(mobileCode, userID);
		System.out.println(result);
	}
}
