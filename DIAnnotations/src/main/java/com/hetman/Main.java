package main.java.com.hetman;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring-config.xml");

        Cook hector = context.getBean(Cook.class);

        System.out.println("It's time to cook!");
        for (Dish dish: hector.getDishes())
        {
            hector.cookDish(dish);
        }
    }
}
