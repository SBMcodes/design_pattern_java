package main.DesignPattern.decorator2;

public class CoffeeOnly extends Coffee{

    @Override
    public double getCost() {
        return 0.5;
    }

    @Override
    public String getIngredients() {
        return "Coffee";
    }
}
