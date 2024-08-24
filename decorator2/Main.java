package main.DesignPattern.decorator2;

public class Main {
    public static void main(String[] args) {
        Coffee c = new Whip(new Milk(new CoffeeOnly()));
        System.out.println(c.getCost());
    }
}
