package com.roger.creator.abstractfactory;

/**
 * Created by Roger on 2016/11/17.
 */
public class Pizza {

    /**
     * 抽象工厂使用对象组合
     */
    private PizzaIngredientFactory ingredientFactory;

    public Pizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare(){
        System.out.println("prepare...");
        System.out.println(ingredientFactory.createCheese());
        System.out.println(ingredientFactory.createClams());
        System.out.println(ingredientFactory.createSauce());
    }

    public void bake(){
        System.out.println("bake...");
    }

    public void cut(){
        System.out.println("cut...");
    }

    public void box(){
        System.out.println("box...");
    }
}
