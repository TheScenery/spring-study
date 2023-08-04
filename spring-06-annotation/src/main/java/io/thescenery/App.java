package io.thescenery;

import io.thescenery.dao.UserDao;
import io.thescenery.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println( "Hello World!" );
        System.out.println(applicationContext.getBean("userDao", UserDao.class).toString());
        System.out.println(applicationContext.getBean("userService", UserService.class).getName());
        System.out.println(applicationContext.getBean("userController").toString());
    }
}
