package lk.susa.ee.interceptor;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.interceptor.AroundConstruct;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.AroundTimeout;
import jakarta.interceptor.InvocationContext;

public class TestInterceptor {

    @AroundConstruct
    @AroundTimeout

    @PostConstruct
    @PreDestroy

    @AroundInvoke
    public Object m(InvocationContext ic) throws Exception {
        System.out.println("TestInterceptor m() start");
        Object proceed = ic.proceed();
        System.out.println("TestInterceptor m() end");
        return proceed;
    }

}
