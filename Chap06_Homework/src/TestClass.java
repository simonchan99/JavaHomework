import Classes.*;

public class TestClass {
    public static void main(String[] args){

        //第一题
        Point p1 = new Point(1,3);
        Point p2 = new Point(2,4);
        p1.printPoint();
        p2.printPoint();
        p1.movePoint(2,4);
        p2.movePoint(3,5);
        p1.printPoint();
        p2.printPoint();

        //第二题
        Rectangle rect = new Rectangle(10,10);
        rect.getArea();
        rect.getPer();
        rect.showAll();

        //第三题
        Laptop macbook = new Laptop("MacBook","i5-6527U");

        //第四题
        Person zhangsan = new PersonCreate("zhangsan",1.73,56);
        zhangsan.sayHello();
        Person lisi = new PersonCreate("lisi",1.74,57);
        lisi.sayHello();

        //第五题
        Person wangwu = new Constructor("wangwu",1.75,55);
        wangwu.sayHello();

    }
}
