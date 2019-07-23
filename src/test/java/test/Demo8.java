package test;

import com.qf.bean.Student;
import com.qf.service.StudentService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 2019/7/2
 * Administrator
 * springdata0701
 * 面向对象面向君  不负代码不负卿
 */
public class Demo8 {
    public static void main(String[] args) {
        ApplicationContext app =
                new ClassPathXmlApplicationContext("springdata.xml");
        StudentService2 service = (StudentService2) app.getBean("studentService2Impl");
        List<Student> aaa = service.findall2(2, "aaa");

    }
}
