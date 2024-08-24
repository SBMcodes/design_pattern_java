package main.DesignPattern.decorator2;

public abstract class Coffee {
    protected String ingSeparator=":";
    abstract double getCost();
    abstract String getIngredients();
}