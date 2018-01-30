package service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Student;
@WebService
@Path("/student")//@Path("/student")���ǽ�����·���еġ�/student��ӳ�䵽�ӿ���
public interface StudentInterface {
	/**
	 * ����id��ѯ����ѧ��
	 */
	@GET//ָ������ʽ���������˷�����ʱ��ָ������GET��POST������ô�ͻ��˷���ʱ����ʹ��GET��POST��
	@Produces(MediaType.APPLICATION_XML)//ָ��������������
	@Path("/list/{id}")//@Path("/query/{id}")���ǽ�"/query"ӳ�䵽�����ϣ�"{id}"ӳ�䵽�����ϣ�����������ԡ�/���������ŵ���{}����
	public Student listStuById(@PathParam("id")long id);
	
	/**
	 * ����name��ѯ���ѧ��
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML,"application/json;charset=utf-8"})
	@Path("/listStus/{name}")
	public List<Student> listStusByName(@PathParam("name")String name);
}
