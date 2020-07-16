package Classes;

public class Laptop {
    String laptopModel;
    String cpuModel;
    public Laptop(){

    }
    public Laptop(String laptop_model, String cpu_model){
        this.laptopModel = laptop_model;
        this.cpuModel = cpu_model;
    }
    public void printInfo(){
        System.out.println("Laptop model: "+ laptopModel + "CPU model: "+ cpuModel);
    }
}
