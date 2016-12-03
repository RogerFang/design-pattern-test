package com.roger.creator.abstractfactory;

import com.roger.creator.abstractfactory.entity.Cheese;
import com.roger.creator.abstractfactory.entity.Clams;
import com.roger.creator.abstractfactory.entity.Sauce;

/**
 * Created by Roger on 2016/11/17.
 */
public class NewYorkPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Clams createClams() {
        return new Clams("New York Clams");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("New York Cheese");
    }

    @Override
    public Sauce createSauce() {
        return new Sauce("New York Sauce");
    }
}
