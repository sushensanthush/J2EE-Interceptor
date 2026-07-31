package lk.susa.ee.interceptor;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import lk.susa.ee.annotation.Logged;

@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 1)
public class LoggingInterceptor {

    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception {
        System.out.println("LoggingInterceptor.intercept logging start");
        Object result = ctx.proceed();
        System.out.println("LoggingInterceptor.intercept logging end");
        return result;
    }
}