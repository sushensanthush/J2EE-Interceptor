package lk.susa.ee.ejb;


import jakarta.ejb.Stateless;
import jakarta.interceptor.Interceptors;
import lk.susa.ee.interceptor.TestInterceptor;

@Stateless
@Interceptors(TestInterceptor.class)
public class UserSessionBean {
    public void doAction(String name, int age) {
        System.out.println("UserSessionBean doAction start");
        System.out.println("UserSessionBean doAction ->:" +name+":"+age);
        System.out.println("UserSessionBean doAction end");
    }
}
