package main.DesignPattern.flyweight;

// We can also make title extrinsic if we want to
// by moving that as parameter to draw function
// Key thing here is to make heavy Resources as intrinsic like Image object
public class FileIcon implements Icon{
    String title;
    Image image;
    public FileIcon(String title,Image image){
        this.title=title;
        this.image=image;
    }
    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing File Icon at x:"+x+" y:"+y);
    }
}
