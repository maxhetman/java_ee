package main.java.com.hetman;

import org.springframework.stereotype.Component;

@Component
public class Sushi implements Dish {

    public void cook() {
        System.out.println("Cooking sushi...");
    }
}
