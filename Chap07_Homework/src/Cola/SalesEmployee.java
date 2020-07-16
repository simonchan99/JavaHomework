package Cola;

public class SalesEmployee extends ColaEmployee {
    int monthSalesFigure;
    double bonusRate;
    public SalesEmployee(String staffName, int staffBirthMonth, int monthSalesFigure, double bonusRate) {
        super(staffName, staffBirthMonth);
        this.monthSalesFigure = monthSalesFigure;
        this.bonusRate = bonusRate;
    }
    //
    public double getSalary(int month) {
        if(super.staffBirthMonth == month) {
            return monthSalesFigure * bonusRate + 100;
        }else {
            return monthSalesFigure * bonusRate;
        }
    }
}
