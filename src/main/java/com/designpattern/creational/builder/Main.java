package com.designpattern.creational.builder;

public class Main {
    public static void main(String[] args) {

        Meal meal1 = new Meal.Builder(Burger.HAMBURGER)
                .drink(Drink.COKE)
                .build();

        System.out.println(meal1);

        Meal meal2 = new Meal.Builder(Burger.CHEESE_BURGER)
                .drink(Drink.ICED_TEA)
                .fries(Fries.FRENCH_FRIES)
                .build();

        System.out.println(meal2);
    }
}
