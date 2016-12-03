package com.roger.creator.abstractfactory.entity;

/**
 * Created by Roger on 2016/11/17.
 */
public class Sauce {

    private String name;

    public Sauce(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "name='" + name + '\'' +
                '}';
    }
}
