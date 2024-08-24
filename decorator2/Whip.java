package main.DesignPattern.decorator2;

public class Whip extends CoffeeDecorator{

    public Whip(Coffee coffee) {
        super(coffee);
    }
    public double getCost(){
        return super.getCost()+2;
    }
    public String getIngredients(){
        return super.getIngredients()+ingSeparator+"Whip";
    }
}
