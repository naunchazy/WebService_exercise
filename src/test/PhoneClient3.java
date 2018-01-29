package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import jdk.internal.util.xml.impl.Input;

/**
 * �������������������ɵĿͻ��˹��ߴ���ʵ��
 */
public class PhoneClient3 {
	//�ֶ���֯SOAP��http+xml��
	public static String getXML(String string) {
		String XML="<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">\r\n" + 
				"      <mobileCode>"+string+"</mobileCode>\r\n" + 
				"      <userID></userID>\r\n" + 
				"    </getMobileCodeInfo>\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>";
		return XML;
	}
	public static void main(String[] args) throws Exception {
		//1.����URL����
		URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
		//2.����Connection����
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		//3.��������ʽ,POSTҪ��д
		connection.setRequestMethod("POST");
		//4.��������ͷ
		connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
		//5.��������д��
		connection.setDoOutput(true);
		connection.setDoInput(true);
		//6. ��֯SOAP���ݣ���������
		String soapxml = getXML("15889323532");
		//7.��ȡ��,д��������
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(soapxml.getBytes());
		//8.���շ��������ص�soap
		String info="";
		if(connection.getResponseCode()==200) {
			//��ȡ������
			InputStream is = connection.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(is));
			info = reader.readLine();
			System.out.println(info);
		}
		//9.�ֶ�����SOAP
		/*SAXReader reader = new SAXReader();
		Document document = reader.read(info);
		Element root = document.getRootElement();
		String path="/soap:Envelope/soap:Body/getMobileCodeInfo/mobileCode";
		Node node = root.selectSingleNode(path);
		String result = node.getText();
		System.out.println(result);*/
		
	}
	
	
	
}
