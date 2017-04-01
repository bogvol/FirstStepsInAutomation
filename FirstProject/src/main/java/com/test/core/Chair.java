package com.test.core;

/**
 * Created by Kengoroo on 09.01.2015.
 */
public class Chair extends Furniture {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chair{owner=" + getOwner()+
                ", weight=" + weight +
                '}';
    }
}
