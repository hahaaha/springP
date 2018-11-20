package com;

import com.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AopConfig.xml");
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();
    }
}
