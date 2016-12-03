package com.roger.creator.abstractfactory.entity;

/**
 * Created by Roger on 2016/11/17.
 */
public class Cheese {

    private String name;

    public Cheese(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                '}';
    }
}
