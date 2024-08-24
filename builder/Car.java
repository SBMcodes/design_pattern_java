package main.DesignPattern.builder;

// Concrete Product which does not have responsibility to build itself
public class Car implements CarPlan{

    public String basement,wheel,engine,roof,mirror,light;

    @Override
    public void setBase(String basement) {
        this.basement = basement;
    }

    @Override
    public void setWheels(String wheelStructure) {
        this.wheel=wheelStructure;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setRoof(String roof) {
        this.roof=roof;
    }

    @Override
    public void setMirrors(String mirror) {
        this.mirror=mirror;
    }

    @Override
    public void setLights(String light) {
        this.light=light;
    }
}
