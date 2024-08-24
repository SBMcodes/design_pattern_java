package main.DesignPattern.builder;

public interface CarBuilder {
    void buildBase();
    void buildWheels();
    void buildEngine();
    void buildRoof();
    void buildMirror();
    void buildLight();
    Car getCar();
}
