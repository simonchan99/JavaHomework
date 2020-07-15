package Cola;

public class TestCompany {
    public static void main(String[] args){

        ColaEmployee[] staff = {
                new HourlyEmployee("Bob", 2, 120, 165),
                new SalariedEmployee("Allan", 1, 12345),
                new SalesEmployee("Claire", 3, 1234567, 0.5),
                new SalesEmployee("Dylan", 4, 123456, 0.5)
        };

        for (int i = 0; i < staff.length; i++) {
            new Company().getSalary(staff[i],2);
        }
    }
}
