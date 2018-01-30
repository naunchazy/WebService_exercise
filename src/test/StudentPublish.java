package test;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

import service.StudentInterfaceImpl;

public class StudentPublish {

	public static void main(String[] args) {
		// 可以发布REST风格数据
		JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
		// 设置服务实现类
		factoryBean.setServiceBean(new StudentInterfaceImpl());
		// 设置资源类,如果有多个资源类，可以以“,”隔开。
		factoryBean.setResourceClasses(StudentInterfaceImpl.class);
		// 设置服务地址
		factoryBean.setAddress("http://localhost:8801/rs");
		// 发布服务
		factoryBean.create();

		System.out.println("发布成功");
	}
/**
*访问：http://localhost:8801/rs/student/list/1
结果：
<student>
<birthday>2018-01-30T21:53:36.336+08:00</birthday>
<id>1</id>
<name>tom</name>
</student>



*因为@Produces({MediaType.APPLICATION_XML,"application/json;charset=utf-8"})默认返回xml数据

*访问：http://localhost:8801/rs/student/listStus/jj
或访问：http://localhost:8801/rs/student/listStus/jj?_type=xml
结果：
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

*访问：http://localhost:8801/rs/student/listStus/jj?_type=json
结果：【json数据为键值对】
{"student":[{"birthday":"1970-01-01T13:18:12.093+08:00","id":1101,"name":"jack"},{"birthday":"1970-01-01T13:31:38.757+08:00","id":1102,"name":"jim"}]}

 * */
}
