package main.DesignPattern.memento;


// Memento(Photograph): Represent state of the object/painting
public class DocumentMemento {
    private String content;

    public DocumentMemento(String content){
        this.content=content;
    }

    public String getContent(){
        return this.content;
    }


}
