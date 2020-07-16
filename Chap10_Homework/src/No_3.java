import java.util.ArrayList;
import java.util.Collections;

public class No_3 {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("banana");
        fruits.add("pear");

        Collections.sort(fruits);

        System.out.println(fruits);
    }
}
