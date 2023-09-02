package com.example.homework;

import com.example.homework.homework1.HelloService;
import org.springframework.context.support.GenericApplicationContext;

public class HomeworkApplication {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();

        context.registerBean("helloService", HelloService.class, HelloService::new);

        context.refresh();

        HelloService helloService = context.getBean("helloService", HelloService.class);

        helloService.sayHello();
    }

}
