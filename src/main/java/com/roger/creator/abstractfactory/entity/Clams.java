package com.roger.creator.abstractfactory.entity;

/**
 * Created by Roger on 2016/11/17.
 */
public class Clams {

    private String name;

    public Clams(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Clams{" +
                "name='" + name + '\'' +
                '}';
    }
}
