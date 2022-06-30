package encapsulation;

public class User {

    private String name; // data hiding w/ private modifier
    private String email; // data hiding w/ private modifier

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }

    public String getEmail() { // Getter
        return email;
    }

    public void setEmail(String email) { // Getter
        this.email = email;
    }
}
