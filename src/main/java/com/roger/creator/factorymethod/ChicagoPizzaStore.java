package com.roger.creator.factorymethod;

/**
 * Created by Roger on 2016/11/17.
 */
public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        return new Pizza("Chicago: " + type);
    }
}
