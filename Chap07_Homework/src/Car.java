public class Car extends Vehicle {
    private final int loader;

    public Car(String brand, String color, int loader) {
        super(brand, color);
        this.loader = loader;
    }

    @Override
    public void run() {
        System.out.println("轿车开起来了！");
    }
}
