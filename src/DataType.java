public class DataType {
    public static void main(String[] args) {
        // Primitive Data Types

        // Integer Types
        byte aByte = 127; // 8-bit signed value
        short aShort = 32767; // 16-bit signed value
        int anInt = 2147483647; // 32-bit signed value
        long aLong = 9223372036854775807L; // 64-bit signed value

        // Floating-Point Types
        float aFloat = 3.14159f; // 32-bit IEEE 754
        double aDouble = 3.14159265358979; // 64-bit IEEE 754

        // Boolean Type
        boolean aBoolean = true; // Value of either true or false

        // Character Type
        char aChar = 'A'; // 16-bit Unicode character

        // Reference Data Types

        // String
        String aString = "Hello, World!";

        // Array
        int[] intArray = {1, 2, 3, 4, 5};

        // Print the values
        System.out.println("Byte: " + aByte);
        System.out.println("Short: " + aShort);
        System.out.println("Int: " + anInt);
        System.out.println("Long: " + aLong);
        System.out.println("Float: " + aFloat);
        System.out.println("Double: " + aDouble);
        System.out.println("Boolean: " + aBoolean);
        System.out.println("Character: " + aChar);
        System.out.println("String: " + aString);
        System.out.println("Array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }

}
