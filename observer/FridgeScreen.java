package main.DesignPattern.observer;

public class FridgeScreen implements TempObserver{
    @Override
    public void update(double temp) {
        System.out.println("(Fridge) Current Temperature: "+temp);
    }
}
