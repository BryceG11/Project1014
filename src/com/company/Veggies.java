package com.company;

public class Veggies {
    public String name = "";
    public double fiberContent = 0;
    public int calories = 0;
    public String color = "";

    public Veggies(String name, double fiberContent, int calories, String color){
        this.name = name;
        this.fiberContent = fiberContent;
        this.calories = calories;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Veggies{" +
                "name='" + name + '\'' +
                ", fiberContent=" + fiberContent +
                ", calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }
}
