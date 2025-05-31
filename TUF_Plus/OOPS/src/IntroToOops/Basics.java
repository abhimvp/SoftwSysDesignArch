import java.util.Scanner;
public class Basics{
    public static void main(String[] args) {
        System.out.println("Hello World"); // printing to console
        // single-line comment
        /* 
        multi-line
        comment
         */
        // data types
        // byte -> -128 to 127 - 8 bits in memory
        byte b = 100; // 1 byte
        // short -> -32,768 to 32,767 - 16 bits in memory
        short s = 1000; // 2 bytes
        // int -> -2,147,483,648 to 2,147,483,647 - 32 bits in memory
        int i = 100000; // 4 bytes - most frequently used data type
        // long -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 - 64 bits in memory
        long l = 100000L; // 8 bytes
        // float -> 3.40282347E+38 to 1.40239846E-45 - 32 bits in memory
        float f = 10.5f; // 4 bytes
        // double -> 1.7976931348623157E+308 to 4.9E-324 - 64 bits in memory
        double d = 20.5; // 8 bytes
        // char -> 0 to 65,535 - 16 bits in memory
        char c = 'A'; // 2 bytes
        // boolean -> true or false - 1 bit in memory
        boolean bool = true; // 1 byte (though it can be considered as 1 bit, Java uses 1 byte for boolean)
        // String -> sequence of characters - not a primitive data type, but a class in Java
        String str = "Hello"; // 2 bytes per character + 2 bytes for the length of the string
        // Arithmetic operators
        int a = 10, b1 = 20;
        int sum = a + b1; // addition
        int diff = a - b1; // subtraction
        int prod = a * b1; // multiplication
        int quot = b1 / a; // division
        int rem = b1 % a; // modulus
        System.out.println("a: " + a + ", b1: " + b1);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Quotient: " + quot);
        System.out.println("Remainder: " + rem);
        // Unary operators
        int x = 10;
        System.out.println("x: " + x);
        System.out.println("x++: " + x++); // post-increment
        System.out.println("++x: " + ++x); // pre-increment
        System.out.println("x--: " + x--); // post-decrement
        System.out.println("--x: " + --x); // pre-decrement
        // ! - NOT operator
        boolean bool1 = true;
        System.out.println("bool1: " + bool1);
        System.out.println("!bool1: " + !bool1); // logical NOT
        // Relational operators
        int a1 = 10, b2 = 20;
        System.out.println("a1: " + a1 + ", b2: " + b2);
        System.out.println("a1 == b2: " + (a1 == b2)); // equal to
        System.out.println("a1 != b2: " + (a1 != b2)); // not equal to
        System.out.println("a1 > b2: " + (a1 > b2)); // greater than
        System.out.println("a1 < b2: " + (a1 < b2)); // less than
        System.out.println("a1 >= b2: " + (a1 >= b2)); // greater than or equal to
        System.out.println("a1 <= b2: " + (a1 <= b2)); // less than or equal to
        // Logical operators
        boolean cond1 = true, cond2 = false;
        System.out.println("cond1: " + cond1 + ", cond2: " + cond2);
        System.out.println("cond1 && cond2: " + (cond1 && cond2)); // logical AND
        System.out.println("cond1 || cond2: " + (cond1 || cond2)); // logical OR
        System.out.println("!(cond1 && cond2): " + !(cond1 && cond2)); // logical NOT
        // // Bitwise operators
        // int num1 = 5, num2 = 3; // 5 = 0101, 3 = 0011 in binary
        // System.out.println("num1: " + num1 + ", num2: " + num2);
        // System.out.println("num1 & num2: " + (num1 & num2)); // bitwise AND
        // System.out.println("num1 | num2: " + (num1 | num2)); // bitwise OR
        // System.out.println("num1 ^ num2: " + (num1 ^ num2)); // bitwise XOR
        // System.out.println("num1 << 1: " + (num1 << 1)); // left shift
        // System.out.println("num1 >> 1: " + (num1 >> 1)); // right shift
        // System.out.println("num1 >>> 1: " + (num1 >>> 1)); // unsigned right shift
        // Ternary operator
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number: " + num + " is " + result); // ternary operator 
        // assignment operators
        int x1 = 10;
        System.out.println("Initial x1: " + x1);
        x1 += 5; // x1 = x1 + 5
        System.out.println("After x1 += 5: " + x1);
        x1 -= 3; // x1 = x1 - 3
        System.out.println("After x1 -= 3: " + x1);
        x1 *= 2; // x1 = x1 * 2
        System.out.println("After x1 *= 2: " + x1);
        x1 /= 4; // x1 = x1 / 4
        System.out.println("After x1 /= 4: " + x1);
        x1 %= 3; // x1 = x1 % 3
        System.out.println("After x1 %= 3: " + x1);
        // Strings
        String name = "John Joe";
        System.out.println("Name: " + name);
        System.out.println("Length of name: " + name.length()); // length of string
        System.out.println("Character at index 0: " + name.charAt(0)); // character at index 0
        System.out.println("Substring from index 0 to 3: " + name.substring(0, 3)); // substring from index 0 to 3
        System.out.println("Uppercase: " + name.toUpperCase()); // convert to uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); // convert to lowercase
        System.out.println("Trimmed name: " + name.trim()); // trim whitespace
        System.out.println("Name contains 'John': " + name.contains("John")); // check if string contains a substring
        System.out.println("Name starts with 'John': " + name.startsWith("John")); // check if string starts with a substring
        System.out.println("Name ends with 'Joe': " + name.endsWith("Joe")); // check if string ends with a substring
        System.out.println("Index of 'o': " + name.indexOf('o')); // index of character 'o'
        System.out.println("Last index of 'o': " + name.lastIndexOf('o')); // last index of character 'o'
        System.out.println("Replace 'John' with 'Jane': " + name.replace("John", "Jane")); // replace substring
        System.out.println("Split by space: " + String.join(", ", name.split(" "))); // split string by space
        // in java strings are immutable, so we need to assign it to a new variable , as we cannot change the original string
        String newName = name.replace("John", "Jane");
        System.out.println("New Name: " + newName);
        // Input and Output
        // we have scanner class in java to take input from user , we import it from java.util package
        // import java.util.Scanner; // uncomment this line to use Scanner class
        Scanner scanner = new Scanner(System.in); // create a scanner object
        int number = scanner.nextInt();
        System.out.println("Number Entered: " + number);
        String str1 = scanner.next();
        String str3 = scanner.next();
        System.out.println("String Entered: " + str1+ " " + str3); // next() takes input until it encounters a space
        // diff between next() and nextLine()
        // next() takes input until it encounters a space
        // nextLine() takes input until it encounters a newline character
        String str2 = scanner.nextLine();
        System.out.println("String Entered: " + str2);
        scanner.close(); // close the scanner object to prevent memory leak
        // New Name: Jane Joe
        // 3
        // Number Entered: 3
        // qwert asdf asdfvcxz
        // String Entered: qwert asdf
        // String Entered:  asdfvcxz
        // Note: Always close the scanner object after use to prevent memory leaks.
        // why not buffered reader?
        // BufferedReader is used for reading text from a character-input stream, buffering characters for efficient reading.
        // It is generally used for reading large amounts of text data, while Scanner is more versatile and easier to use for simple input tasks.
        // comes under java.io package - it doesn't have nextInt(), nextDouble() etc. methods like Scanner
        // for ds-algo we use Scanner class for input as it is easier to use and has more methods for different data types
        // type casting
        // type casting is converting one data type to another
        // implicit type casting (widening conversion) - converting a smaller data type to a larger data type
        int num2 = 100; // int
        long num3 = num2; // long - implicit type casting
        System.out.println("Implicit Type Casting: " + num3); // 100
        // explicit type casting (narrowing conversion) - converting a larger data type to a smaller data type
        long num4 = 1000L; // long
        int num5 = (int) num4; // int - explicit type casting
        System.out.println("Explicit Type Casting: " + num5); // 1000
        // Note: Explicit type casting can lead to data loss if the value is too large for the target data type.
        // Example of data loss
        long largeNum = 10000000000L; // long
        int smallNum = (int) largeNum; // explicit type casting
        System.out.println("Data Loss Example: " + smallNum); // -147483648 (data loss occurs)
        // Note: Always be cautious while performing explicit type casting as it can lead to data loss.
        // Constants
        final int CONSTANT_VALUE = 100; // final keyword is used to declare a constant
        System.out.println("Constant Value: " + CONSTANT_VALUE);
        // Constants are variables whose value cannot be changed once assigned.
        // They are declared using the final keyword in Java.
        // Constants are useful when you want to define a value that should not change throughout the program or package o in code base.
    }
}