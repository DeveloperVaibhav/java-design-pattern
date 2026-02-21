package com.designpattern.creational.builder;

import java.util.Objects;

public class Meal {

    //required field
    private final Burger burger;
    //optional fields
    private final Drink drink;
    private final Fries fries;

    //private meal constructor used only by the Builder
    private Meal(Builder builder){
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.fries = builder.fries;
    }

    // Getters to access the values set via the Builder
    public Burger getBurger(){
        return burger;
    }

    public Drink getDrink(){
        return drink;
    }

    public Fries getFries(){
        return fries;
    }

    /*@Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", fries=" + fries +
                '}';
    }*/
    // Returns a string representation of the Meal
    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + displayValue(drink) +
                ", fries=" + displayValue(fries) +
                '}';
    }

    private String displayValue(Object value) {
        //shows optional value as None instead of null in output
        return Objects.toString(value, "None");
    }

    // Static inner Builder for constructing Meal objects
    public static class Builder{
        //required field
        private Burger burger;
        //optional fields
        private Drink drink;
        private Fries fries;

        public Builder(Burger burger){
            this.burger = Objects.requireNonNull(burger,"Burger is required");
        }
        // Setter for optional drink
        public Builder drink(Drink drink){
            this.drink = drink;
            return this;
        }
        // Setter for optional fries
        public Builder fries(Fries fries){
            this.fries = fries;
            return this;
        }
        // Builds the Meal instance
        public Meal build(){
            return new Meal(this);
        }
    }
}
