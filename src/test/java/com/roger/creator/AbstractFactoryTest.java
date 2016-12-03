package com.roger.creator;

import com.roger.creator.abstractfactory.ChicagoPizzaIngredientFactory;
import com.roger.creator.abstractfactory.Pizza;
import org.junit.Test;

/**
 * Created by Roger on 2016/12/3.
 */
public class AbstractFactoryTest {

    @Test
    public void test(){
        Pizza pizza = new Pizza(new ChicagoPizzaIngredientFactory());
        pizza.prepare();
    }
}
