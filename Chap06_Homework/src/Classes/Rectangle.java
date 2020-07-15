package Classes;

public class Rectangle {

    int width;
    int height;
    int area;
    int perimeter;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void getArea(){
        area = width*height;
        System.out.println("Classes.Rectangle's area is: "+area);
    }
    public void getPer(){
        perimeter = width*2 + height*2;
        System.out.println("Classes.Rectangle's perimeter is: "+perimeter);
    }
    public void showAll(){
        System.out.println("width is "+width+" height is "+height);

    }
}

