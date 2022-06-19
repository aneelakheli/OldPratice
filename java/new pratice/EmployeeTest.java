import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("carl carter", 7500, 1987, 12, 30);
        staff[1] = new Employee("harry potter", 6700, 1989, 10, 1);
        staff[2] = new Employee("tony tester", 5600, 1990, 3, 12);

        for (Employee e : staff)
            e.raiseSalary(4);
        for (Employee e : staff)
            System.out.println("name " + e.getName() + " ,salary = " + e.getSalary() + ", hireday = " + e.getHireDay);

    }
}

class Employee {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date gethireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}