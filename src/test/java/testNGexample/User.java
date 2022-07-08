package testNGexample;

import com.github.javafaker.Faker;

public class User {

    private String name, email;
    private String company;

    public User(String name) {
        this.name = name;
        this.email = this.name.concat("@company.com");
        this.company = new Faker().company().name();
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User that = (User) obj;
            return this.name.equals(that.name) && this.email.equals(that.email);
        }
        return false;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
