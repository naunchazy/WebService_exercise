package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Student;

public class StudentInterfaceImpl implements StudentInterface {

	@Override
	public Student listStuById(long id) {
		Student stu=new Student();
		stu.setId(id);
		stu.setName("tom");
		stu.setBirthday(new Date());
		return stu;
	}

	@Override
	public List<Student> listStusByName(String name) {
		Student stu1=new Student();
		stu1.setId(1101);
		stu1.setName("jack");
		stu1.setBirthday(new Date(19092093));
		Student stu2=new Student();
		stu2.setId(1102);
		stu2.setName("jim");
		
		stu2.setBirthday(new Date(19898757));
		List<Student> list=new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		return list;
	}

}
