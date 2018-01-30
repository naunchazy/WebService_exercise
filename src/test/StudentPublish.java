package test;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import service.StudentInterfaceImpl;

public class StudentPublish {

	public static void main(String[] args) {
		// ���Է���REST�������
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		// ���÷���ʵ����
		factoryBean.setServiceBean(new StudentInterfaceImpl());
		// ������Դ��,����ж����Դ�࣬�����ԡ�,��������
		factoryBean.setResourceClasses(StudentInterfaceImpl.class);
		// ���÷����ַ
		factoryBean.setAddress("http://localhost:8801/rs");
		// ��������
		factoryBean.create();

		System.out.println("�����ɹ�");
	}
/**
*���ʣ�http://localhost:8801/rs/student/list/1
�����
<student>
<birthday>2018-01-30T21:53:36.336+08:00</birthday>
<id>1</id>
<name>tom</name>
</student>



*��Ϊ@Produces({MediaType.APPLICATION_XML,"application/json;charset=utf-8"})Ĭ�Ϸ���xml����

*���ʣ�http://localhost:8801/rs/student/listStus/jj
����ʣ�http://localhost:8801/rs/student/listStus/jj?_type=xml
�����
<students>
<student>
<birthday>1970-01-01T13:18:12.093+08:00</birthday>
<id>1101</id>
<name>jack</name>
</student>
<student>
<birthday>1970-01-01T13:31:38.757+08:00</birthday>
<id>1102</id>
<name>jim</name>
</student>
</students>

*���ʣ�http://localhost:8801/rs/student/listStus/jj?_type=json
�������json����Ϊ��ֵ�ԡ�
{"student":[{"birthday":"1970-01-01T13:18:12.093+08:00","id":1101,"name":"jack"},{"birthday":"1970-01-01T13:31:38.757+08:00","id":1102,"name":"jim"}]}

 * */
}
