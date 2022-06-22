package datatypes1;


public class DataTypesDemo {

    public static void main(String[] args) {
        // 8 primitive data types
        char c = '\uffff'; // '\uffff'; 'C'
        byte b = 127; // -128...127; 'b'
        short s = 32_767; // -32768...32767; 's'
        int i = 2_147_483_647; // -2_147_483_648...2_147_483_647; 'i'
        long l = 9_223_372_036_854_775_807l; // -9_223_372_036_854_775_808l...9_223_372_036_854_775_807l; 'l'
        float f = 9_223_372_036_854_775_807.6f; // 100.5f; 'f'
        double d = 9_223_372_036_854_775_807.6; // 100.5; 'd'
        boolean bool = true; // true or false

        // reference data types
        Object object = new Object();
        String str = new String("Test Automation");

        // literals
        byte bt = 100;
        char ch = 'A';
        int num = 1000;
        String string = "Automation course";

        // https://www.tutorialspoint.com/java/java_basic_datatypes.htm

    }
}
