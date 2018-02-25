package com.hetman;

import com.hetman.data.dao.Student;
import com.hetman.data.entities.Teacher;
import com.hetman.worker.WorkWithStudents;
import com.hetman.worker.WorkWithTeachers;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class App{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        WorkWithStudents worker =
                (WorkWithStudents) context.getBean("worker");
        Student testStudent = new Student("Vlad Valt", 5);
        worker.saveStudentToDb(testStudent);


        WorkWithTeachers workWithTeacher =
                (WorkWithTeachers) context.getBean("teachersWorker");
        Teacher teacher = new Teacher();
        teacher.setFirstname("Andrii");
        teacher.setLastname("Glybovets");
        teacher.setCellphone("+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setBirthDate(new Date());
        workWithTeacher.saveTeacher(teacher);

    }
}
