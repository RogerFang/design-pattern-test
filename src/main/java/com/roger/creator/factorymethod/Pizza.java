package com.roger.creator.factorymethod;

/**
 * Created by Roger on 2016/11/17.
 */
public class Pizza {

    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void prepare(){
        System.out.println("prepare...");
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

    @Override
    public String toString() {
        return "Pizza{" +
                "type='" + type + '\'' +
                '}';
    }
}
