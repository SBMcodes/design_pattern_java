package main.DesignPattern.memento;

import java.util.ArrayList;
import java.util.List;

// Caretaker(ArtCollector): Keeps track of the snapshots
// We can modify it as the application demands
public class DocHistory {
    private List<DocumentMemento> states;

    public DocHistory(){
        states=new ArrayList<>();
    }

    public void addMemento(DocumentMemento memento){
        states.add(memento);
    }

    public DocumentMemento getMemento(int index){
            if(index>=0 && index<states.size()){
                return states.get(index);
            }
            return null;
        }
}
