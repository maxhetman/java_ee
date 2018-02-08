package main.java.com.hetman;

import org.springframework.stereotype.Component;

@Component
public class Pizza implements Dish {

    public void cook() {
        System.out.println("Cooking pizza...");
    }
}
