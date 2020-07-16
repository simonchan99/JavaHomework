import java.util.Scanner;

public class Homework {

    //第一题
    public void number(){
        System.out.println("输入除数和被除数：");
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        try{
            int a =Integer.parseInt(num1);
            int b =Integer.parseInt(num2);
            int outcome = a/b;
            System.out.println("成功执行！结果是："+outcome);
        } catch (NumberFormatException e){
            System.out.println("请输入数字！");
        } catch (ArithmeticException e){
            System.out.println("除数不可为零！");
        } finally {
            System.out.println("总是被输出");
        }
    }

    //第二题
    public void compareString(){
        System.out.println("输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String strA = scanner.nextLine();
        String strB = null;
        try {
            if(strA.equals(strB)){
                System.out.println("They are the same.");
            } else {
                System.out.println("They are different.");
            }
        }catch (NullPointerException e ){
            System.out.println("其中一个字符串为空！");
        }
    }
}
