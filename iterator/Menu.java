package main.DesignPattern.iterator;

import java.util.*;

public class Menu {
    public List<String> menuItems=new ArrayList<>();

    public void addItem(String item){
        menuItems.add(item);
    }

//    As there is only one list which we are interested to iterated
//    That's why there's only one iterator but we could have implemented
//    many iterators based on our requirements

    public MenuIterator<String> getIterator(){
        return new MenuIterator<String>(menuItems);
    }
}
