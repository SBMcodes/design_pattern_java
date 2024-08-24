package main.DesignPattern.builder;

// Director for CarBuilders
// We can have different types of directors for different use cases
public class CarMechanic {
    CarBuilder builder;

    public CarMechanic(CarBuilder builder){
        this.builder = builder;
    }

    public Car build(){
        builder.buildBase();
        builder.buildWheels();
        builder.buildEngine();
        builder.buildRoof();
        builder.buildLight();
        builder.buildMirror();
        return this.getCar();
    }

    public Car getCar(){
        return builder.getCar();
    }
}
