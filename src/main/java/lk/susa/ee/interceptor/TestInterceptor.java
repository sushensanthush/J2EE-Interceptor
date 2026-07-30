package lk.susa.ee.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class TestInterceptor {

    @AroundInvoke
    public Object m(InvocationContext ic){
        System.out.println("TestInterceptor m()...");
        return null;
    }

}
