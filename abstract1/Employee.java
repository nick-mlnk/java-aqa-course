package abstract1;

public abstract class Employee {

    private String name;
    private String email;
    private int hours;
    private double rate;

    public Employee(String name, String email, int hours, double rate) {
        this.name = name;
        this.email = email;
        this.hours = hours;
        this.rate = rate;
    }

    public abstract double getMonthSalary();

    public int getHours() {
        return hours;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }
}
