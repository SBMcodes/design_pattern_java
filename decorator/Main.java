package main.DesignPattern.decorator;

public class Main {
    public static void main(String[] args) {
        House h = new ColorHouseDecorator(new SimpleHouse(),"purple");
        System.out.println(h.makeHouse());
    }
}
