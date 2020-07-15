public class Homework {
    //练习1
    public void factorial(int inputNumber){
        int i = 1;
        int product = 1;
        while(i < inputNumber){
            product = product*(i+1);
            i++;
        }
        System.out.println(product);
    }

    //练习2
    public void isLeapYear(int inputYear){
        if(inputYear%4==0&&inputYear%100!=0){
            System.out.println(inputYear+"是闰年");
        }else if(inputYear%400==0){
            System.out.println(inputYear+"是闰年");
        }else {
            System.out.println(inputYear+"不是闰年");
        }
    }

    //选做1
    public void printPrimeNum(int greaterThan) {
        greaterThan = 200;
        for (int i  = greaterThan; i%2==0; i++){

        }
    }

    //选做2
    public void sortArray(){

    }
}
