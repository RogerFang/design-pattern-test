package com.roger.creator;

import com.roger.creator.factorymethod.ChicagoPizzaStore;
import com.roger.creator.factorymethod.PizzaStore;
import org.junit.Test;

/**
 * Created by Roger on 2016/12/3.
 */
public class FactoryMethodTest {

    @Test
    public void test(){
        PizzaStore store = new ChicagoPizzaStore();
        store.orderPizza("cheese");
    }
}
