package innerclasses;

import java.util.Random;

public class UserWithPrivateAddress {
    int id;
    Address address;

    // inner class
    private class Address {
        private String country;
        private String city;
        private String street;

        public Address() {
            this.country = "Ukraine";
            this.city = "Lviv";
            this.street = "Horodotska";
        }

        @Override
        public String toString() { // override toString method for having custom representation
            return String.format("Country: %s, City: %s, Street: %s", country, city, street);
        }
    }

    public UserWithPrivateAddress() {
        this.id = Math.abs(new Random().nextInt());
        this.address = new UserWithPrivateAddress.Address();
    }

    public void print() {
        System.out.println(String.format("Id: %s\nAddress[%s]", id, this.address.toString()));
    }
}
