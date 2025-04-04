/* 
Arrays

Write a code to show how to create and use arrays in Java.

*/

public class intro {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print the first element of the array
        System.out.println("The first element of the array is: " + numbers[0]);

        // Access and print the third element of the array
        System.out.println("The third element of the array is: " + numbers[2]);

        // Modify the second element of the array
        numbers[1] = 10;

        // Print the modified second element of the array
        System.out.println("The modified second element of the array is: " + numbers[1]);
    }
}

/*
Output:
The first element of the array is: 1
The third element of the array is: 3
The modified second element of the array is: 10
*/

