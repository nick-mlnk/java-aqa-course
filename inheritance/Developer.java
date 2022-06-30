package inheritance;

import static java.lang.String.format;

public class Developer extends Employee { // derived/child -> Subclass

    private String programmingLanguage; // subclass field

    public Developer(String name, String email, String programmingLanguage) {
        super(name, email); // invoke the superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return format("Developer[name: %s, email: %s, programming language: %s]",
                super.getName(), super.getEmail(), this.programmingLanguage);
    }
}
