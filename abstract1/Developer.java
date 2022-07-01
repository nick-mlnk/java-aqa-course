package abstract1;

import static java.lang.String.format;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, String email, int hours, double rate, String programmingLanguage) {
        super(name, email, hours, rate);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getMonthSalary() {
        return super.getRate() * super.getHours() + 100;
    }

    @Override
    public String toString() {
        return format("Developer[name: %s, email: %s, programming language: %s] with salary %s$",
                super.getName(), super.getEmail(), this.programmingLanguage, getMonthSalary());
    }
}
