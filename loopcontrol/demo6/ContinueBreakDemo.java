package loopcontrol.demo6;

public class ContinueBreakDemo {

    public static void main(String[] args) {
        int[] array = {3, 5, 8, 13, 21, 100, 200, 300};
        for (int number : array) {
            if (number % 7 == 0) {
                break; // break or continue code
            } else {
                System.out.println(number);
            }
        }
    }
}
