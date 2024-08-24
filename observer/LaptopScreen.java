package main.DesignPattern.observer;

public class LaptopScreen implements TempObserver{
    @Override
    public void update(double temp) {
        System.out.println("(Laptop) Current Temperature: "+temp);
    }
}
