import java.util.Scanner;

public class Sum {
    public static int digitSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int num = sc.nextInt();
        if (num > 1000 || num < 0){
            System.out.println("数字超出范围！");
            return 0;
        }
        int sum = 0;
        while(num != 0){
            sum = sum + num % 10;
            num = num/10;
        }
        System.out.println("所给数字的各个位数之和为："+sum);
        return 0;
    }
}
