package main.DesignPattern.iterator;

public interface IteratorInterface<T> {
    boolean hasNext();
    T next();
    void restart();
}
