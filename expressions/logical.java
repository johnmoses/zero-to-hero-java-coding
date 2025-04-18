/**
 * Logical operators in Java.
 */
public class logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // Logical AND operator
        if (a < b && b < c) {
            System.out.println("Both conditions are true");
        }

        // Logical OR operator
        if (a < b || b > c) {
            System.out.println("At least one condition is true");
        }

        // Logical NOT operator
        if (!(a > b)) {
            System.out.println("Condition is false");
        }
    }
}
