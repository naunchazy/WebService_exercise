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
		// ��һ�������������ַ������WSDL��ַ
		URL url = new URL("http://localhost:8801/rs/student/listStus/jj?_type=json");
		// �ڶ�������һ��ͨ������ַ������
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		// �����������ò���
		// 3.1���ͷ�ʽ���ã�POST�����д
		connection.setRequestMethod("GET");
		// Post ������ʹ�û���
		connection.setUseCaches(false);
		connection.setInstanceFollowRedirects(true);
		// 3.2�������ݸ�ʽ��content-type
		// 3.3���������������ΪĬ���´�����connectionû�ж�дȨ�ޣ�
		connection.setDoInput(true);
		connection.setDoOutput(true);
		// ���岽�����շ������Ӧ����ӡ
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
			System.out.println("����ʧ��~");
		}
	}
/*�����
 * {"student":[{"birthday":"1970-01-01T13:18:12.093+08:00","id":1101,"name":"jack"},{"birthday":"1970-01-01T13:31:38.757+08:00","id":1102,"name":"jim"}]}*/
}
