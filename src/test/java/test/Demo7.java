package test;

import com.qf.bean.Student;
import com.qf.service.StudentService;
import com.qf.service.StudentService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
public class Demo7 {
    public static void main(String[] args) {
        ApplicationContext app=
                new ClassPathXmlApplicationContext("springdata.xml");
        StudentService2 service=(StudentService2) app.getBean("studentService2Impl");
        Page<Student> students = service.findall(1, 3);
        for (Student student :students.getContent()) {
            System.out.println(student.getSname());
        }
    }
}
