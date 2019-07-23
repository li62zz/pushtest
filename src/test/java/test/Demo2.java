package test;

import com.qf.bean.Menu;
import com.qf.bean.Role;
import com.qf.bean.Student;
import com.qf.service.MenuService;
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
public class Demo2 {
    public static void main(String[] args) {
        ApplicationContext app=
                new ClassPathXmlApplicationContext("springdata.xml");
        MenuService service=(MenuService) app.getBean("menuservice");
        List<Menu> menus = service.findmenus();
        for (Menu menu : menus) {
            System.out.println(menu.getMenuName());
            List<Role> roleList =  menu.getRoleList();
            for (Role role : roleList) {
                System.out.println("\t"+role.getRname());
            }
        }

    }
}
