package main.DesignPattern.decorator;

public class HouseDecorator implements House{

    protected House house;

    public HouseDecorator(House h){
        this.house=h;
    }

    @Override
    public String makeHouse() {
        return house.makeHouse();
    }
}
