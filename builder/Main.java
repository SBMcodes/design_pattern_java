package main.DesignPattern.builder;

public class Main {
    public static void main(String[] args) {
        Car highEndCar = new CarMechanic(new HighEndCarBuilder()).build();
        Car lowEndCar = new CarMechanic(new LowEndCarBuilder()).build();

        System.out.println(highEndCar.engine);
        System.out.println(lowEndCar.roof);


    }
}

// When to use
// - we have a complex class with many constructors
// - when we need to skip some steps in some cases
// - when we have to build composite tree objects
// - when we want to build complex representation of complex object but use same general steps

// We don't need to use this pattern for simple objects We can use factory method for that
