package test;

import client1.MobileCodeWS;
import client1.MobileCodeWSSoap;
/**方法一：
 * 服务器端使用的是公网服务地址提供的号码归属地查询，自动生成的客户端代码client1.
 * 该类为具体的实现
 */
public class PhoneClient {

	public static void main(String[] args) {
		//1.创建服务视图
		//@WebServiceClient
		MobileCodeWS mobileCodeWS = new MobileCodeWS();
		//2.获取服务实现类
		//@WebService
		MobileCodeWSSoap port = mobileCodeWS.getPort(MobileCodeWSSoap.class);
		String mobileCode="15889323532";
		String userID=null;//userID可为null
		//3.调用查询方法
		String result = port.getMobileCodeInfo(mobileCode, userID);
		System.out.println(result);

	}

}
