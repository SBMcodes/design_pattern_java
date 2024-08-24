package main.DesignPattern.builder;

// CarPlan is the abstract product that will be returned as ConcreteProduct from builder
// Although it's not always necessary to have interface for AbstractProduct
public interface CarPlan {
     void setBase(String basement);
     void setWheels(String wheelStructure);
     void setEngine(String engine);
     void setRoof(String roof);
     void setMirrors(String mirror);
     void setLights(String light);
}