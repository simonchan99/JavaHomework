public class Vehicle {
    String brand;
    String color;
    double speed = 0;

    public Vehicle(String brand, String color){
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }
    public void run(){
        System.out.println("开起来了！");
    }
}
