package com.tdh.urlInterceptor.interceptor;

import com.tdh.urlInterceptor.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class UrlInterceptorTest {
    @Autowired
    private UrlInterceptor urlInterceptor;

    @Test
    public void preHandle() throws Exception {
        urlInterceptor.preHandle(null, null, null);
    }
}
