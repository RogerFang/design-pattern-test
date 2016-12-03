package com.roger.creator.abstractfactory;

import com.roger.creator.abstractfactory.entity.Cheese;
import com.roger.creator.abstractfactory.entity.Clams;
import com.roger.creator.abstractfactory.entity.Sauce;

/**
 * Created by Roger on 2016/11/17.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Clams createClams() {
        return new Clams("Chicago Clams");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("Chicago Cheese");
    }

    @Override
    public Sauce createSauce() {
        return new Sauce("Chicago Sauce");
    }
}
