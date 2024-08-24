package main.DesignPattern.memento;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("");
        DocHistory docHistory = new DocHistory();

        docHistory.addMemento(doc.getDocMemento());

        doc.write("Hello WOrld");

        docHistory.addMemento(doc.getDocMemento());

        doc.write(" Its the world");

        docHistory.addMemento(doc.getDocMemento());

        doc.write(" I dont know");

        docHistory.addMemento(doc.getDocMemento());

        System.out.println(doc.getContent());

        doc.restoreFromMemento(docHistory.getMemento(1));

        System.out.println(doc.getContent());

    }
}
