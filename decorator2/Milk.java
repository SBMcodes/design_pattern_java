package main.DesignPattern.decorator2;

public class Milk extends CoffeeDecorator{

    public Milk(Coffee c){
        super(c);
    }

    @Override
    double getCost() {
        return super.getCost()+1;
    }

    @Override
    String getIngredients() {
        return super.getIngredients()+ingSeparator+"Milk";
    }
}
