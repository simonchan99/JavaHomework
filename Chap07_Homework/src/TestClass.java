import Geometry.Circle;
import Geometry.Rectangle;

public class TestClass {
    public static void main(String[] args){
        //第一题
        Players[] crew = new Players[11];
        for(int i = 0; i<11; i++ ){
            crew[i] = new Players(i+1);
            System.out.println("创建了第"+(i+1)+"个成员");
        }

        //第二题
        Vehicle benz = new Vehicle("Mercedese Benz","Black");
        benz.run();

        Car honda = new Car("Honda","red",2);
        honda.run();

        //第三题
        Rectangle rectangle = new Rectangle(10,10,"blue");
        rectangle.showAll();

        Circle circle = new Circle(10,"red");
        circle.showAll();

        //第四题


    }
}
