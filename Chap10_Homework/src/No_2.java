import java.util.ArrayList;
import java.util.Random;

public class No_2 {
    public static void main(String[] args){
        ArrayList<Integer> Integers = new ArrayList<Integer>();
        for(int index = 0; index < 20; index++){
            Integers.add(new Random().nextInt(5)+1);
        }
        System.out.println(Integers);
    }
}
