package Geometry;

public class Circle extends Shape {
    private double radius;
    public Circle(){
    }
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        area = radius*radius*3.14159;
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        perimeter = 2*3.14159*radius;
        return super.getPerimeter();
    }

    @Override
    public void showAll() {
        super.showAll();
    }
}
