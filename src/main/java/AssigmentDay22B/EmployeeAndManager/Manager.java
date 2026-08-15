package AssigmentDay22B.EmployeeAndManager;

public class Manager extends Employe {

    private double bonus;

    public Manager(
            String id,
            String name,
            double baseSalary,
            double bonus) {

        super(id, name, baseSalary);

        if (bonus < 0) {
            this.bonus = 0.0;
        } else {
            this.bonus = bonus;
        }
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {

        if (bonus >= 0) {
            this.bonus = bonus;
        }
    }

    @Override
    public double calculateTotalSalary() {

        return getBaseSalary() + bonus;
    }

    @Override
    public String getEmployeeDetails() {

        return "Manager [ID: " + getId()
                + ", Name: " + getName()
                + ", Total Salary: " + calculateTotalSalary()
                + ", Bonus: " + bonus
                + "]";
    }
}