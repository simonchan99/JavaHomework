package Cola;

public class SalariedEmployee extends ColaEmployee {
    private int monthSalary;
    public SalariedEmployee(String staffName, int staffBirthMonth, int monthSalary) {
        super(staffName, staffBirthMonth);
        this.monthSalary = monthSalary;
    }

    public double getSalary(int month) {
        if (super.staffBirthMonth==month) {
            return monthSalary +100;
        }else {
            return monthSalary;
        }

    }
}
