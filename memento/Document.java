package main.DesignPattern.memento;

// Originator(Artist): Responsible for creating and managing state
public class Document {
    private String content;

    public Document(String content){
        this.content=content;
    }

    public void write(String newContent){
        this.content+=newContent;
    }

    public String getContent(){
        return this.content;
    }

    public DocumentMemento getDocMemento(){
        return new DocumentMemento(this.content);
    }

    public void restoreFromMemento(DocumentMemento memento){
        this.content=memento.getContent();
    }
}
