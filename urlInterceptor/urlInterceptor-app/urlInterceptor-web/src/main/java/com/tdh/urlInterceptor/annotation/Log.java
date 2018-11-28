package com.tdh.urlInterceptor.annotation;

import java.lang.annotation.*;

/**
 * 记录url拦截日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
}
