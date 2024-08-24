package main.DesignPattern.decorator;

public class ColorHouseDecorator extends HouseDecorator{
    final private String color;
    public ColorHouseDecorator(House h,String color){
        super(h);
        this.color=color;
    }
    private String addColors(){
        return " with "+this.color+" color";
    }

    @Override
    public String makeHouse() {
        return super.makeHouse()+addColors();
    }
}
