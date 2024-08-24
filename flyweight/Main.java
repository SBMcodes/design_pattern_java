package main.DesignPattern.flyweight;

public class Main {
    public static void main(String[] args) {
        Icon fileIcon1 = IconFactory.getIcon("file");
        Icon fileIcon2 = IconFactory.getIcon("file");
        Icon folderIcon1 = IconFactory.getIcon("folder");

        fileIcon1.draw(45,12);
        fileIcon2.draw(84,16);
        folderIcon1.draw(212,160);
    }
}
