public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Unary Operators
        int x = 5, y = -x; // Unary minus
        System.out.println("y = " + y);
        boolean isPositive = true;
        System.out.println("!isPositive = " + !isPositive); // Logical NOT

        // Increment/Decrement Operators
        int z = 10;
        System.out.println("z++ = " + (z++)); // Post-increment
        System.out.println("z = " + z);
        System.out.println("++z = " + (++z)); // Pre-increment

        // Relational Operators
        int p = 10, q = 20;
        System.out.println("p > q = " + (p > q)); // Greater than
        System.out.println("p < q = " + (p < q)); // Less than
        System.out.println("p >= q = " + (p >= q)); // Greater than or equal to
        System.out.println("p <= q = " + (p <= q)); // Less than or equal to
        System.out.println("p == q = " + (p == q)); // Equal to
        System.out.println("p != q = " + (p != q)); // Not equal to

        // Logical Operators
        boolean condition1 = true, condition2 = false;
        System.out.println("condition1 && condition2 = " + (condition1 && condition2)); // Logical AND
        System.out.println("condition1 || condition2 = " + (condition1 || condition2)); // Logical OR

        // Bitwise Operators
        int m = 5, n = 7;
        System.out.println("m & n = " + (m & n)); // Bitwise AND
        System.out.println("m | n = " + (m | n)); // Bitwise OR
        System.out.println("m ^ n = " + (m ^ n)); // Bitwise XOR
        System.out.println("~m = " + (~m)); // Bitwise Complement

        // Assignment Operators
        int r = 10;
        r += 5; // r = r + 5
        System.out.println("r = " + r);
        r -= 3; // r = r - 3
        System.out.println("r = " + r);
        r *= 2; // r = r * 2
        System.out.println("r = " + r);
        r /= 4; // r = r / 4
        System.out.println("r = " + r);
        r %= 3; // r = r % 3
        System.out.println("r = " + r);
    }
}