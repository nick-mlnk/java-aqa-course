package innerclasses;


public class UserWithStaticClass {

    // inner class
    public static class Address {
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

}
