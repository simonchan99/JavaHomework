package Geometry;

public class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(){
    }

    public Rectangle(double width, double height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        area = width*height;
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        perimeter = width+height;
        return super.getPerimeter();
    }

    @Override
    public void showAll() {
        super.showAll();
    }
}
