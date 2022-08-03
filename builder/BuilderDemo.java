package builder;

public class BuilderDemo {

    public static void main(String[] args) {
        User user = User.builder()
                .withCompany("Google")
                .withEmail("nick@email.com")
                .build();
        System.out.println(user);
    }
}
