package com.myspr.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.myspr.demo.Student;

public class Studentservice {

public static void main(String[] args) {

/*Student student=new Student();
System.out.println(student.getName());
BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
Student student=(Student)factory.getBean("student");
*/

	BeanFactory factory=new ClassPathXmlApplicationContext("spring.xml");
	Student student=(Student)factory.getBean("student");
    System.out.println(student);
    System.out.println(student.getAddress());


}
}