package test;

import client1.MobileCodeWS;
import client1.MobileCodeWSSoap;
/**����һ��
 * ��������ʹ�õ��ǹ��������ַ�ṩ�ĺ�������ز�ѯ���Զ����ɵĿͻ��˴���client1.
 * ����Ϊ�����ʵ��
 */
public class PhoneClient {

	public static void main(String[] args) {
		//1.����������ͼ
		//@WebServiceClient
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		//2.��ȡ����ʵ����
		//@WebService
		MobileCodeWSSoap port = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		String mobileCode="15889323532";
		String userID=null;//userID��Ϊnull
		//3.���ò�ѯ����
		String result = port.getMobileCodeInfo(mobileCode, userID);
		System.out.println(result);

	}

}
