/**
 * Expressions in Java.
 */
public class intro {
    // Arithmetic expressions
    public static int calculateSum(int a, int b) {
        return a + b * (a - b) / 2;
    }


    // Relational expressions 
    public static boolean compareValues(int x, int y) {
        return (x > y) && (x != 0);
    }


    // String expressions
    public static String concatenateStrings(String str1, String str2) {
        return str1 + " " + str2;
    }


    // Ternary expression
    public static String checkValue(int num) {
        return (num > 0) ? "Positive" : "Non-positive";
    }


    // Compound assignment expression
    public static void incrementValue(int[] arr) {
        arr[0] += 10;
    }

    public static void main(String[] args) {
        // Arithmetic expressions
        int sum = calculateSum(5, 3);
        System.out.println("Sum: " + sum);

        // Relational expressions
        boolean result = compareValues(10, 5);
        System.out.println("Result: " + result);

        // String expressions
        String fullName = concatenateStrings("John", "Doe");
        System.out.println("Full Name: " + fullName);

        // Ternary expression
        String valueCheck = checkValue(-3);
        System.out.println("Value Check: " + valueCheck);

        // Compound assignment expression
        int[] numbers = {5};
        incrementValue(numbers);
        System.out.println("Incremented Value: " + numbers[0]);
    }
}