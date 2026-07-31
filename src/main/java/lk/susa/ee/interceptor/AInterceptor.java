package lk.susa.ee.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.InvocationContext;

public class AInterceptor {

    @AroundInvoke
    public Object m(InvocationContext ic) throws Exception {
        System.out.println("AInterceptor m() start");
        Object proceed = ic.proceed();
        System.out.println("AInterceptor m() end");
        return proceed;

    }
}
