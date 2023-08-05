package io.thescenery;

import io.thescenery.myproxy.ProxyInvocationHandler;
import io.thescenery.service.UserService;
import io.thescenery.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        ProxyInvocationHandler myInvocationHandler = new ProxyInvocationHandler(userServiceImpl);
        UserService userServiceProxy =(UserService) myInvocationHandler.getProxy();
        userServiceProxy.add();
    }
}
