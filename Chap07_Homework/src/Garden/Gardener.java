package Garden;

import java.util.Scanner;

public class Gardener {
    public Fruit createFruit(){
        System.out.println("What kind of fruit do you want?");
        Scanner scanner = new Scanner(System.in);
        String fruitName = scanner.nextLine();

        //先创建一个fruit对象，置空
        Fruit fruit = null;

        //通过输入的字符来确定该创建哪种对象
        switch (fruitName) {
            case "apple" : {
                fruit = new Apple();
                break;
            }
            case "banana" : {
                fruit = new Banana();
                break;
            }
            case "grape" : {
                fruit = new Grape();
                break;
            }
            default:{
                System.out.println("We don't have that. Try another one.");
            }
        }

        return fruit;
    }
}
