package main.DesignPattern.builder;

public class LowEndCarBuilder implements CarBuilder{
    Car car;

    public LowEndCarBuilder(){
        car = new Car();
    }

    @Override
    public void buildBase() {
        car.setBase("Low End Base");
    }

    @Override
    public void buildWheels() {
        car.setWheels("Low end wheels");
    }

    @Override
    public void buildEngine() {
        car.setEngine("Low end Engine");
    }

    @Override
    public void buildRoof() {
        car.setRoof("Static roof");
    }

    @Override
    public void buildMirror() {
        car.setMirrors("Cheap mirror");
    }

    @Override
    public void buildLight() {
        car.setLights("Cheap Light");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

