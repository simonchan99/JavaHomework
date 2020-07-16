package Cola;

public class Company {

    public void getSalary(ColaEmployee employee, int month){
        //根据ColaEmployee生成的不同子类，调用不同子类下的方法。
        System.out.println(employee.staffName+"的月薪为:"+employee.getSalary(month));
    }
}
