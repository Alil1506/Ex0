import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Working with int data type
        int a = 5; // Declaring an integer 'a' and assigning it the value 5
        int b = 2; // Declaring an integer 'b' and assigning it the value 2

        int c = a + b; // Adding 'a' and 'b' and storing the result in 'c'
        System.out.println("a + b: " + c); // Output: 7

        c = a - b; // Subtracting 'b' from 'a'
        System.out.println("a - b: " + c); // Output: 3

        c = a * b; // Multiplying 'a' by 'b'
        System.out.println("a * b: " + c); // Output: 10

        c = a / b; // Dividing 'a' by 'b' (integer division, so no decimals)
        System.out.println("a / b: " + c); // Output: 2

        c = a % b; // Finding the remainder of 'a' divided by 'b'
        System.out.println("a % b: " + c); // Output: 1


        // Working with double data type with decimal numbers
        double x = 5.5; // Declaring a double 'x' and assigning it the value 5.5
        double y = 2.3; // Declaring a double 'y' and assigning it the value 2.3

        double z = x + y; // Adding 'x' and 'y'
        System.out.println("x + y: " + z); // Output: 7.8

        z = x - y; // Subtracting 'y' from 'x'
        System.out.println("x - y: " + z); // Output: 3.2

        z = x * y; // Multiplying 'x' by 'y'
        System.out.println("x * y: " + z); // Output: 12.65

        z = x / y; // Dividing 'x' by 'y' (result has decimals)
        System.out.println("x / y: " + z); // Output: 2.391304347826087

        z = x % y; // Finding the remainder of 'x' divided by 'y'
        System.out.println("x % y: " + z); // Output: 0.8999999999999999 (due to floating-point precision)


        // Working with char data type
        char d = 'a'; // Declaring a char 'd' with the value 'a'
        char e = '@'; // Declaring a char 'e' with the value '@'
        char s = '~'; // Declaring a char 's' with the value '~'
        char g = '6'; // Declaring a char 'g' with the value '6'
        char h = '9'; // Declaring a char 'h' with the value '9'

        System.out.println("Character g: " + g); // Output: 6


        // Working with String data type
        String i = "Hello World!"; // Declaring a String 'i' with the value "Hello World!"
        String j = "a"; // Declaring a String 'j' with the value "a"
        String k;

        k = i.toLowerCase(); // Converts 'i' to lowercase
        System.out.println("i.toLowerCase(): " + k); // Output: hello world!

        k = i.toUpperCase(); // Converts 'i' to uppercase
        System.out.println("i.toUpperCase(): " + k); // Output: HELLO WORLD!

        k = i.replace('o', '#'); // Replaces 'o' with '#' in 'i'
        System.out.println("i.replace('o', '#'): " + k); // Output: Hell# W#rld!

        char m = i.charAt(6); // Retrieves the character at index 6 in 'i'
        System.out.println("i.charAt(6): " + m); // Output: W

        k = i.substring(2, 7); // Extracts substring from index 2 to 6
        System.out.println("i.substring(2, 7): " + k); // Output: llo W

        k = i.substring(5); // Extracts substring from index 5 to the end
        System.out.println("i.substring(5): " + k); // Output: World!


        // Working with boolean data type
        boolean t = true; // Declaring a boolean 't' with the value true
        boolean f = false; // Declaring a boolean 'f' with the value false

        System.out.println("Boolean t: " + t); // Output: true
        System.out.println("Boolean f: " + f); // Output: false

        System.out.println("t && f: " + (t && f)); // Logical AND: true and false, Output: false
        System.out.println("t || f: " + (t || f)); // Logical OR: true or false, Output: true
        System.out.println("t && !f: " + (t && !f)); // Logical AND: true and NOT false, Output: true
        System.out.println("!t || f: " + (!t || f)); // Logical OR: NOT true or false, Output: false

        System.out.println("i.equals(\"Hello World!\"): " + i.equals("Hello World!")); // Checks if 'i' equals "Hello World!", Output: true
    }
}
