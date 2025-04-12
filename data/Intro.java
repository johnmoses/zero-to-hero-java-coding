/*
Data, values and types
*/
public class Intro {
    // Primitive data types
    public static void demonstratePrimitives() {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14159265359;
        boolean bool = true;
        char c = 'A';
        byte[] byteArray = new byte[5];
        short[] shortArray = new short[5];
        int[] intArray = new int[5];
        System.out.println(b);
    }


    // Reference types
    public static void demonstrateReferences() {
        String str = "Hello World";
        Integer integer = 42;
        Double decimal = 3.14;
        Boolean flag = Boolean.TRUE;
        Character character = 'A';
        System.out.println(str);
    }


    // Arrays
    public static void demonstrateArrays() {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] words = new String[3];
        words[0] = "Java";
        words[1] = "Programming";
        words[2] = "Language";
        System.out.println(words[1]);
    }


    // Type conversion examples
    public static void demonstrateTypeConversion() {
        int x = 10;
        double y = x; // implicit conversion
        double z = 3.14;
        int rounded = (int) z; // explicit casting
        System.out.println(rounded);
    }

    public static void main(String[] args) {
        demonstratePrimitives();
        demonstrateReferences();
        demonstrateArrays();
        demonstrateTypeConversion();
    }
}

