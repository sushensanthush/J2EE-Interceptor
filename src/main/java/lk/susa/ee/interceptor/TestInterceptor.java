package lk.susa.ee.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class TestInterceptor {

    @AroundInvoke
    public Object m(InvocationContext ic) throws Exception {
        System.out.println("TestInterceptor m()...");
        ic.proceed();
        return null;
    }

}
