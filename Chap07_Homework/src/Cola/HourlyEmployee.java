package Cola;

public class HourlyEmployee extends ColaEmployee {
    int hourSalary;
    int hourPerMonth;
    public HourlyEmployee(String staffName, int staffBirthMonth, int hourSalary, int hourPerMonth) {
        super(staffName, staffBirthMonth);
        this.hourSalary = hourSalary;
        this.hourPerMonth = hourPerMonth;
    }
    public double getSalary(int month) {
        if(super.staffBirthMonth==month) {
            if (hourPerMonth>160) {
                return hourSalary*160+hourSalary*(hourPerMonth-160)*1.5+100;
            }else {
                return hourSalary*hourPerMonth+100;
            }
        }else {
            if (hourPerMonth>160) {
                return hourSalary*160+hourSalary*(hourPerMonth-160)*1.5;
            }else {
                return hourSalary*hourPerMonth;
            }
        }
    }
}
