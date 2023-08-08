package io.thescenery;

import io.thescenery.config.AppConfig;
import io.thescenery.dao.UserMapperImpl;
import io.thescenery.mapper.UserMapper;
import io.thescenery.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserMapper userMapper = (UserMapper) context.getBean("userMapperImpl");
        User user = userMapper.getUser("1");
        System.out.println(user);
        User user1 = new User("2", "name2");
        userMapper.addAndDelete(user1);
    }
}
