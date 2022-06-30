package polymorphism;

public class Employee {
    private String name;
    private String email;
    protected final int hoursPerMonth = 160;
    protected final double ratePerHour = 20;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public double getMonthSalary() {
        return hoursPerMonth * ratePerHour;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

}
