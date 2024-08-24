package main.DesignPattern.observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherStation implements TempSubject{

    Set<TempObserver> tempObservers = new HashSet<>();
    double curTemp;

    public WeatherStation(double temp){
        this.curTemp=temp;
    }

    public void changeTemp(double temp){
        this.curTemp=temp;
        notifyObservers();
    }

    @Override
    public void addObserver(TempObserver o) {
        tempObservers.add(o);
    }

    @Override
    public void removeObserver(TempObserver o) {
        tempObservers.remove(o);
    }

    @Override
        public void notifyObservers() {
        for(TempObserver o: tempObservers){
            o.update(this.curTemp);
        }
    }
}
