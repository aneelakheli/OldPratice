class Employeee {
    int id;
    int salary;
    static String company = "hellocompany";

    static void check() {
        company = "IIT";
    }

    Employeee(int i, int s) {
        id = i;
        salary = s;
    }

    void display() {
        System.out.println(id + " " + salary + " " + company + " ");
    }
}

public class StaicKey {
    public static void main(String[] args) {
        Employeee.check();
        Employeee e1 = new Employeee(1, 34000);
        Employeee e2 = new Employeee(2, 320000);
        e1.display();
        e2.display();

    }
}