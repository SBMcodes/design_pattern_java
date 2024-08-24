package main.DesignPattern.builder;

public class HighEndCarBuilder implements CarBuilder{
    Car car;

    public HighEndCarBuilder(){
        car = new Car();
    }

    @Override
    public void buildBase() {
        car.setBase("High End Base");
    }

    @Override
    public void buildWheels() {
        car.setWheels("High end wheels");
    }

    @Override
    public void buildEngine() {
        car.setEngine("High end Engine");
    }

    @Override
    public void buildRoof() {
        car.setRoof("Flexible roof");
    }

    @Override
    public void buildMirror() {
        car.setMirrors("Expensive mirror");
    }

    @Override
    public void buildLight() {
        car.setLights("Expensive Light");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
