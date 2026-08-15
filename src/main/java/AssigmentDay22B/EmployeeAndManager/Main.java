package AssigmentDay22B.EmployeeAndManager;

public class Main {
    public static void main(String[] args) {

        Employe emp =
                new Employe("E01", "Alice", 5000.0);

        System.out.println(emp.calculateTotalSalary());
        System.out.println(emp.getEmployeeDetails());

        System.out.println();

        Manager mgr =
                new Manager("M01", "Bob", 8000.0, 2000.0);

        System.out.println(mgr.calculateTotalSalary());
        System.out.println(mgr.getEmployeeDetails());

        System.out.println();

        mgr.setBonus(-500.0);

        System.out.println("Bonus after invalid update: "
                + mgr.getBonus());

        mgr.setBonus(3000.0);

        System.out.println("Bonus after valid update: "
                + mgr.getBonus());

        System.out.println("New Total Salary: "
                + mgr.calculateTotalSalary());
    }
}