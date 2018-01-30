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
@Path("/student")//@Path("/student")就是将请求路径中的“/student”映射到接口上
public interface StudentInterface {
	/**
	 * 根据id查询单个学生
	 */
	@GET//指定请求方式，如果服务端发布的时候指定的是GET（POST），那么客户端访问时必须使用GET（POST）
	@Produces(MediaType.APPLICATION_XML)//指定服务数据类型
	@Path("/list/{id}")//@Path("/query/{id}")就是将"/query"映射到方法上，"{id}"映射到参数上，多个参数，以“/”隔开，放到“{}”中
	public Student listStuById(@PathParam("id")long id);
	
	/**
	 * 根据name查询多个学生
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML,"application/json;charset=utf-8"})
	@Path("/listStus/{name}")
	public List<Student> listStusByName(@PathParam("name")String name);
}
