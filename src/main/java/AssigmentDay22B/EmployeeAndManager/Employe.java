package AssigmentDay22B.EmployeeAndManager;

public class Employe {

    private String id;
    private String name;
    private double baseSalary;


    public Employe(String id, String name, double baseSalary) {

        this.id = id;
        this.name = name;

        if (baseSalary < 0) {
            this.baseSalary = 0.0;
        } else {
            this.baseSalary = baseSalary;
        }
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateTotalSalary() {
        return baseSalary;
    }

    public String getEmployeeDetails() {

        return "Employee [ID: " + id
                + ", Name: " + name
                + ", Total Salary: " + calculateTotalSalary()
                + "]";
    }
}