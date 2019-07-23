package test;

import com.qf.bean.Student;
import com.qf.bean.Wife;
import com.qf.service.StudentService;
import com.qf.service.WifeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
public class Demo4 {
    public static void main(String[] args) {
        ApplicationContext app=
                new ClassPathXmlApplicationContext("springdata.xml");
        StudentService service=(StudentService) app.getBean("stuservice");
        List<Student> students = service.findstus(2, "陈辉1");
        for (Student student : students) {
            System.out.println(student.getSname()+","+student.getSid());
        }

    }
}
