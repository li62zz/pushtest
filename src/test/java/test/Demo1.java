package test;

import com.qf.bean.Grade;
import com.qf.bean.Student;
import com.qf.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
public class Demo1 {
    public static void main(String[] args) {
        ApplicationContext app=
                new ClassPathXmlApplicationContext("springdata.xml");
        StudentService service=(StudentService) app.getBean("stuservice");
        List<Student> students = service.findByGrade_Cname("java1903");
        for (Student student : students) {
            System.out.println(student.getSname());
        }




      /*  Student student = service.findBySid(2);
        System.out.println(student.getSname()+",");
        System.out.println(student.getGrade().getCname());*/
      /*   Grade grade= service.findByCid(1);
        System.out.println(grade.getCname());
       List<Student> studentlist = grade.getStudentlist();
        for (Student o : studentlist) {
            System.out.println("\t"+o.getSname());
        }*/
    }
}
