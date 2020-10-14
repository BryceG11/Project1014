package com.company;

import java.util.Comparator;

public class SortByName implements Comparator<Veggies> {
    @Override
    public int compare(Veggies v1, Veggies v2) {
        return v1.name.compareTo(v2.name);
    }
}
