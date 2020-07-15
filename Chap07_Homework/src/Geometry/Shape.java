package Geometry;

public class Shape {
    double area;
    double perimeter;
    String color;

    public Shape(){
    }
    public Shape(String color){
        this.color = color;
    }

    public double getArea() {
        return area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public String getColor() {
        return color;
    }

    public void showAll(){
        System.out.println("面积、周长、颜色分别为: "+ getArea()+" "+getPerimeter()+" "+getColor());

    }
}
