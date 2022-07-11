package builder;

public class User {

    private String name;
    private String surname;
    private String email;
    private String company;
    private String title;

    public User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.company = builder.company;
        this.title = builder.title;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public static Builder builder() {
        return new User.Builder();
    }

    public static class Builder {

        private String name;
        private String surname;
        private String email;
        private String company;
        private String title;

        public Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
