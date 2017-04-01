package com.test.core;

/**
 * Created by Kengoroo on 09.01.2015.
 */
public class Table extends Furniture {
    private String color;
    private int size;

    public Table() {
    }

    public Table(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override                   //переопределение метода
    public String toString() {
        return "Table{owner=" + getOwner() +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
