import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {
    //第一题
    public void addNumber(){
        System.out.println("输入两个数字：");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        try{
            int a =Integer.parseInt(num1);
            int b =Integer.parseInt(num2);
            int outcome = a+b;
            System.out.println("成功执行！结果是："+outcome);
        } catch (NumberFormatException e){
            System.out.println("请输入数字！");
        } catch (ArithmeticException e){
            System.out.println("除数不可为零！");
        }
    }

    //第二题
    public void charCount(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入字符串：");
        String sourceString = scanner.nextLine();
        System.out.println("输入查找字符：");
        String targetString = scanner.nextLine();

        int startIndex = 0;
        int counter = 0;
        while(sourceString.indexOf(targetString, startIndex) >= 0 && startIndex < sourceString.length()){
            startIndex = sourceString.indexOf(targetString, startIndex)+1;
            counter++;
        }
        System.out.println("所查找字符出现次数为："+counter);
    }

    //第三题
    public void sortRandom(){
        double[] array = new double[10];
        for (int index = 0; index<array.length; index++){
            array[index] = new Random().nextDouble()*100;
        }
        Arrays.sort(array);
        for (int index = 0; index<array.length; index++){
            System.out.println(array[index]);
        }
    }
}
