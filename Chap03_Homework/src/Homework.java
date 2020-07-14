import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    //第一题，算奖金
    public void getBonus(int profit) {
        double bonus = 0;
        if (profit<100000){
            bonus = profit * 0.1;
        }else if (profit>100000 && profit <= 200000){
            bonus = (profit-100000)*0.075;
        }else if (profit>200000 && profit <= 400000){
            bonus = (profit-200000)*0.05;
        }else if (profit>400000 && profit <= 600000){
            bonus = (profit-400000)*0.03;
        }else if (profit>600000 && profit <= 1000000){
            bonus = (profit-600000)*0.015;
        }else if (profit>1000000) {
            bonus = (profit-1000000)*0.01;
        }
        System.out.println("Bonus is: "+bonus);
    }

    //第二题，算分数等级
    public void getGrade(int score){
        switch(score/10){
            case(10):
            case(9):
                System.out.println("A");
                break;
            case(8):
                System.out.println("B");
                break;
            case(7):
                System.out.println("C");
                break;
            case(6):
                System.out.println("D");
                break;
            default:
                System.out.println("E");
                break;
        }
    }

    //第三题，验奇偶
    public void getParity(int inputNumber){
        if(inputNumber%2 == 0){
            System.out.println("是偶数");
        }else {
            System.out.println("是奇数");
        }
    }

    //第四题，验数字
    public void verifyNumber(int inputNumber){
        if(inputNumber==1||inputNumber==5||inputNumber==10){
            System.out.println(inputNumber);
        }else {
            System.out.println("none");
        }
    }

    //第五题，验能否被5、6整除
    public void divisibleBy(int inputNumber){
        if(inputNumber%5==0 && inputNumber%6==0){
            System.out.println("可以被5和6整除");
        } else if(inputNumber%5==0 && inputNumber%6!=0){
            System.out.println("可以被5整除");
        } else if(inputNumber%5!=0 && inputNumber%6==0){
            System.out.println("可以被6整除");
        } else if(inputNumber%5!=0 && inputNumber%6!=0){
            System.out.println("不可以被5或6整除");
        }
    }

    //第六题，验是不是闰年
    public void isLeapYear(int year){
        boolean flag1=(year%4==0);
        boolean flag2=(year%100==0);
        boolean flag3=(year%400==0);
        if((flag1&&!flag2)||(flag3)){
            System.out.println(year+" 是闰年");
        }
        else System.out.println(year+" 不是闰年");
    }

    //第七题，算分数等级
    public void printGrade(int score){
        if(score<0||score>100){
            System.out.println("输入无效");
        } else if(score>90&&score<=100){
            System.out.println("A");
        } else if(score>80&&score<=90){
            System.out.println("B");
        } else if(score>70&&score<=80){
            System.out.println("C");
        } else if(score>60&&score<=70){
            System.out.println("D");
        } else if(score<=60){
            System.out.println("E");
        }
    }

    //第八题，给xyz排序
    public void sortXYZ(int x, int y, int z){
        int[] array = new int[]{x,y,z};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //第九题，输出5位及以内的各个位数的数字
    public void printDigit() {
        String[] digits = new String[]{"个","十","百","千","万"};
        Scanner scanner = new Scanner(System.in);
        //String inputNumber = Integer.toString(scanner.nextInt());
        String inputNumber = new StringBuffer(Integer.toString(scanner.nextInt())).reverse().toString();
        int i = 0;
        System.out.println("输入数字：");
        while (i<inputNumber.length()) {
            if(inputNumber.length()>5){
                System.out.println("超出范围！");
                break;
            }
            System.out.println(digits[i] + "位数是" + inputNumber.charAt(i));
            i++;
        }
    }
}
