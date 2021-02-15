package com.example;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) {

       final ApplicationContext context =  Micronaut.run(Application.class, args);
       final HelloWorldService service = context.getBean(HelloWorldService.class);
        System.out.println(service.sayHi());
        context.close();

    }
}
