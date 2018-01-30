package client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.swing.text.AbstractDocument.BranchElement;

import org.bouncycastle.crypto.engines.ISAACEngine;

public class client {

	public static void main(String[] args) throws Exception {
		// 第一步：创建服务地址，不是WSDL地址
		URL url = new URL("http://localhost:8801/rs/student/listStus/jj?_type=json");
		// 第二步：打开一个通向服务地址的连接
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		// 第三步：设置参数
		// 3.1发送方式设置：POST必须大写
		connection.setRequestMethod("GET");
		// Post 请求不能使用缓存
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		// 3.2设置数据格式：content-type
		// 3.3设置输入输出，因为默认新创建的connection没有读写权限，
		connection.setDoInput(true);
		connection.setDoOutput(true);
		// 第五步：接收服务端响应，打印
		int responseCode = connection.getResponseCode();
		// System.out.println(responseCode);
		if (200 == responseCode) {
			InputStream is = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(inputStreamReader);
			String result = reader.readLine();
			System.out.println(result.toString());
			is.close();
			inputStreamReader.close();
			reader.close();
		} else {
			System.out.println("连接失败~");
		}
	}
/*结果：
 * {"student":[{"birthday":"1970-01-01T13:18:12.093+08:00","id":1101,"name":"jack"},{"birthday":"1970-01-01T13:31:38.757+08:00","id":1102,"name":"jim"}]}*/
}
