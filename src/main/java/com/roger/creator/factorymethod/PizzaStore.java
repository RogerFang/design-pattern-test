package com.roger.creator.factorymethod;

/**
 * Created by Roger on 2016/11/17.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println(pizza);
        return pizza;
    }

    /**
     * factory method
     * 1.工厂方法是抽象的，所以依赖子类来处理对象的创建。
     * 2.工厂方法必须返回一个产品，超类中定义的方法通常用到工厂方法的返回值。
     * 3.工厂方法将超类（客户）中的代码（例如orderPizza）和实际创建的具体产品代码分开。
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
