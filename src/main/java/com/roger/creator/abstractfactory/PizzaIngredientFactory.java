package com.roger.creator.abstractfactory;


import com.roger.creator.abstractfactory.entity.Cheese;
import com.roger.creator.abstractfactory.entity.Clams;
import com.roger.creator.abstractfactory.entity.Sauce;

/**
 * Created by Roger on 2016/11/17.
 */
public interface PizzaIngredientFactory {

    Clams createClams();

    Cheese createCheese();

    Sauce createSauce();
}
