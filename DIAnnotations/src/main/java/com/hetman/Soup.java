package main.java.com.hetman;

import org.springframework.stereotype.Component;

@Component
public class Soup implements Dish {

    public void cook() {
        System.out.println("Cooking soup...");
    }
}
