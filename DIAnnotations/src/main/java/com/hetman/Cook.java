package main.java.com.hetman;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class Cook {

    @Autowired
    private Collection<Dish> dishes;

    public void cookDish(Dish dish)
    {
        dish.cook();
    }

    public Collection<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Collection<Dish> dishes) {
        this.dishes = dishes;
    }
}
