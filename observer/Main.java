package main.DesignPattern.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation(45);
        LaptopScreen ls = new LaptopScreen();
        FridgeScreen fs = new FridgeScreen();

        ws.addObserver(ls);
        ws.addObserver(fs);

        ws.changeTemp(32);

        ws.removeObserver(fs);

        ws.changeTemp(42);

    }
}
