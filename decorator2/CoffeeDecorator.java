package main.DesignPattern.decorator2;

public class CoffeeDecorator extends Coffee{

    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    double getCost() {
        return coffee.getCost();
    }

    @Override
    String getIngredients() {
        return coffee.getIngredients();
    }
}
