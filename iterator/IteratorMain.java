package main.DesignPattern.iterator;



public class IteratorMain {
    public static void main(String[] args) {
        Menu menu = new Menu();

        menu.addItem("Cheese");
        menu.addItem("Rosemary");
        menu.addItem("Sandwich");



        IteratorInterface menuIt = menu.getIterator();

        while(menuIt.hasNext()){
            System.out.println(menuIt.next());
        }
    }
}
