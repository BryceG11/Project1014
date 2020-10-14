package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	ArrayList<Veggies> veggieBasket = new ArrayList<Veggies>();
	veggieBasket.add(new Veggies("Carrot", 2.5, 300, "Orange"));
	veggieBasket.add(new Veggies("Broccoli", 0.9, 39, "Green"));
	veggieBasket.add(new Veggies("Cauliflower", 11.3, 6, "White"));
	veggieBasket.add(new Veggies("Brussel Sprouts", 25, 86, "Green"));
	veggieBasket.add(new Veggies("Green Beans", 6.8, 55, "Green"));
	veggieBasket.add(new Veggies("Beets", 8.5, 100, "Redish"));
	veggieBasket.add(new Veggies("Red Peppers", 2, 20, "Red"));
	veggieBasket.add(new Veggies("Eggplant", 6.9, 111, "Purple"));
	veggieBasket.add(new Veggies("Spinach?", 9.8, 43, "Green"));
	veggieBasket.add(new Veggies("Corn on the Cob", 24, 87, "Yellow"));
	veggieBasket.add(new Veggies("Corn on the Cob", 24, 88, "Blue"));
	System.out.println("Before sorting: " + veggieBasket);
	Collections.sort(veggieBasket, new SortByName());
	System.out.println("After sorting: " + veggieBasket);
	String funk = new Veggies("Tod", 3.2,98, "Blue").toString();
	System.out.println(funk);
    }
}
