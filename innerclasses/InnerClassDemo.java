package innerclasses;

public class InnerClassDemo {

    public static void main(String[] args) {
        UserWithPrivateAddress user1 = new UserWithPrivateAddress();
        user1.print();
        System.out.println("===============");

        UserWithPublicAddress user2 = new UserWithPublicAddress();
        UserWithPublicAddress.Address address = user2.new Address();
        System.out.println(address);
        System.out.println("===============");

        UserWithStaticClass.Address address1 = new UserWithStaticClass.Address();
        System.out.println(address1);
    }
}
