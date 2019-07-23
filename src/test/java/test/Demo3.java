package test;

import com.qf.bean.Menu;
import com.qf.bean.Role;
import com.qf.bean.Wife;
import com.qf.service.MenuService;
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
public class Demo3 {
    public static void main(String[] args) {
        ApplicationContext app=
                new ClassPathXmlApplicationContext("springdata.xml");
        WifeService service=(WifeService) app.getBean("wifeservice");
        List<Wife> menus = service.getwifes();
        for (Wife wife : menus) {
            System.out.println(wife.getWifeName()+","+wife.getHusband().getHusName());
        }

    }
}
