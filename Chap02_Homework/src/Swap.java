import java.util.Scanner;

public class Swap {
   public void swapInt(){
       int a = 0;
       int b = 0;
       int temp = 0;
       Scanner scan = new Scanner(System.in);
       System.out.print("输入整数a：");
       if (scan.hasNextInt()) {
           // 判断输入的是否是整数
           a = scan.nextInt();
       } else {
           // 输入错误的信息
           System.out.println("输入的不是整数！");
       }
       System.out.print("输入整数b：");
       if (scan.hasNextInt()) {
           // 判断输入的是否是整数
           b = scan.nextInt();
       } else {
           // 输入错误的信息
           System.out.println("输入的不是整数！");
       }
       temp = a;
       a = b;
       b = temp;
       System.out.println("调换后的值为：a:"+a+" b:"+b);
   }
}
