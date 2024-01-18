package com.yazici.interceptor;

import io.quarkus.logging.Log;
import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@BookServiceInterceptorBinding
@Interceptor
@Priority(Interceptor.Priority.PLATFORM_BEFORE)
public class BookServiceInterceptor {

    @AroundInvoke
    public Object logMethodEntry(InvocationContext context) throws Exception {
        Log.info("Entering method: " + context.getMethod().getName());
        try {
            return context.proceed();
        } finally {
            Log.info("Exiting method: " + context.getMethod().getName());
        }
    }

}
