package main.DesignPattern.iterator;

import java.util.List;

public class MenuIterator<T> implements IteratorInterface<T>{
    private int index=0;
    private List<T> arr;

    public MenuIterator(List<T> arr){
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        return this.index<this.arr.size();
    }

    @Override
    public T next() {
        if(this.index<arr.size()){
            return arr.get(index++);
        }
        return null;
    }

    @Override
    public void restart() {
        this.index=0;
    }


}
