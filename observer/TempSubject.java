package main.DesignPattern.observer;

public interface TempSubject {
    void addObserver(TempObserver o);
    void removeObserver(TempObserver o);
    void notifyObservers();
}
