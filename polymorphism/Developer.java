package polymorphism;

import static java.lang.String.format;

public class Developer extends Employee {

    private String programmingLanguage;
    private double monthSalary;
    private double rate = 2;

    public Developer(String name, String email, String programmingLanguage) {
        super(name, email);
        this.programmingLanguage = programmingLanguage;
        this.monthSalary = super.getMonthSalary() * rate;
    }

    @Override
    public double getMonthSalary() { // Overrided method of the superclass
        return this.monthSalary;
    }

    public void setMonthSalary(double rate) { // overloaded method w/ 1 param
        this.monthSalary = super.getMonthSalary() * rate;
    }

    public void setMonthSalary(double rate, int additionalHours) { // overloaded method w/ 2 params
        this.rate = rate;
        this.monthSalary = (super.hoursPerMonth + additionalHours) * super.ratePerHour * this.rate;
    }

    @Override
    public String toString() {
        return format("Developer[name: %s, email: %s, programming language: %s] with salary %s$",
                super.getName(), super.getEmail(), this.programmingLanguage, getMonthSalary());
    }
}
