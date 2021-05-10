package com.ceiba.coffee.model.entity;


import com.ceiba.coffee.model.valueobject.Money;
import lombok.Getter;

@Getter
public class Coffee {

    private final int id;
    private final String name;
    private final CoffeeCategory category;
    private final Money price;
    private final int units;

    public Coffee(int id, String name, CoffeeCategory category, Money price, int units) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.units = units;
    }

}
