class Basics {
    public static void main(String[] args){ // entrypoint - comments
        /* Multiline
         * comments
         */
        System.out.println("command line inputs provided are:");
        // Data types
        // -128 to 127 // 8 bits
        byte num = 100; // 1 byte
        System.out.println(num);
        // short -32768 to 32767 // 2 bytes
        short num2 = 10000; // 2 bytes
        System.out.println(num2);
        // int -2^31 to 2^31-1 // 4 bytes
        int num3 = 100000; // 4 bytes
        System.out.println(num3);
        // long -2^63 to 2^63-1 // 8 bytes
        long num4 = 10000000000L; // 8 bytes
        System.out.println(num4);
        // float -3.40282347E+38 to 3.40282347E+38 // 4 bytes
        float num5 = 100.0f; // 4 bytes
        System.out.println(num5);
        // double -1.7976931348623157E+308 to 1.7976931348623157E+308 // 8 bytes
        double num6 = 100.0; // 8 bytes
        System.out.println(num6);
        // char 0 to 65535 // 2 bytes
        char ch = 'A'; // 2 bytes
        System.out.println(ch);
        // boolean true or false // 1 bit
        boolean bool = true; // 1 bit
        System.out.println(bool);
        // String - sequence of characters
        String str = "Hello World"; // 2 bytes per character
        System.out.println(str);
        // StringBuilder - mutable sequence of characters
        StringBuilder sb = new StringBuilder("Hello World"); // 2 bytes per character
        System.out.println(sb);
        // StringBuffer - mutable sequence of characters, thread-safe
        StringBuffer sbf = new StringBuffer("Hello World"); // 2 bytes per character
        System.out.println(sbf);
        // Array - collection of similar data types
        int[] arr = {1, 2, 3, 4, 5}; // 4 bytes per element
        System.out.println(arr[0]);
        // ArrayList - resizable array
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(); // 4 bytes per element
        list.add(1);
        list.add(2);    
        list.add(3);
        System.out.println(list);
        // LinkedList - doubly linked list
        java.util.LinkedList<Integer> linkedList = new java.util.LinkedList<>(); // 4 bytes per element
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        // HashMap - key-value pairs
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>(); // 4 bytes per element
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        // Operators
        // Arithmetic operators
        int a = 10;
        int b = 20;
        int c = a + b; // addition
        System.out.println("Addition: " + c);
        c = a - b; // subtraction
        System.out.println("Subtraction: " + c);
        c = a * b; // multiplication
        System.out.println("Multiplication: " + c);
        c = a / b; // division
        System.out.println("Division: " + c);
        c = a % b; // modulus
        System.out.println("Modulus: " + c);
        // Increment and Decrement operators
        a++; // increment
        System.out.println("Increment: " + a);
        b--; // decrement
        System.out.println("Decrement: " + b);  
        // Relational operators
        boolean result = a == b; // equal to
        System.out.println("Equal to: " + result);
        result = a != b; // not equal to
        System.out.println("Not equal to: " + result);
        result = a > b; // greater than
        System.out.println("Greater than: " + result);
        result = a < b; // less than
        System.out.println("Less than: " + result);
        result = a >= b; // greater than or equal to
        System.out.println("Greater than or equal to: " + result);
        result = a <= b; // less than or equal to
        System.out.println("Less than or equal to: " + result);
        // Logical operators
        boolean x = true;
        boolean y = false;  
        boolean z = x && y; // logical AND
        System.out.println("Logical AND: " + z);
        z = x || y; // logical OR
        System.out.println("Logical OR: " + z);
        z = !x; // logical NOT
        System.out.println("Logical NOT: " + z);
        // Bitwise operators
        int d = 10; // 1010
        int e = 20; // 10100
        int f = d & e; // bitwise AND
        System.out.println("Bitwise AND: " + f);
        f = d | e; // bitwise OR
        System.out.println("Bitwise OR: " + f);
        f = d ^ e; // bitwise XOR
        System.out.println("Bitwise XOR: " + f);
        f = ~d; // bitwise NOT
        System.out.println("Bitwise NOT: " + f);
        f = d << 2; // left shift
        System.out.println("Left shift: " + f); 
        f = d >> 2; // right shift
        System.out.println("Right shift: " + f);
        // Assignment operators
        a = 10;
        b = 20;
        a += b; // a = a + b
        System.out.println("Addition assignment: " + a);
        a -= b; // a = a - b
        System.out.println("Subtraction assignment: " + a);
        a *= b; // a = a * b
        System.out.println("Multiplication assignment: " + a);
        a /= b; // a = a / b
        System.out.println("Division assignment: " + a);
        a %= b; // a = a % b
        System.out.println("Modulus assignment: " + a);
        // Ternary operator
        int max = (a > b) ? a : b; // if a is greater than b, max = a, else max = b
        System.out.println("Max: " + max);  
        // instanceof operator
        String str2 = "Hello";
        boolean isString = str2 instanceof String; // checks if str2 is an instance of String
        System.out.println("Is String: " + isString);
        // Type casting
        int num7 = 100;
        double num8 = num7; // implicit casting
        System.out.println("Implicit casting: " + num8);
        double num9 = 100.5;
        int num10 = (int) num9; // explicit casting
        System.out.println("Explicit casting: " + num10);
        // String concatenation
        String str3 = "Hello";
        String str4 = " World";
        String str5 = str3 + str4; // concatenation
        System.out.println("Concatenation: " + str5);
        // String comparison
        boolean isEqual = str3.equals(str4);
        System.out.println("String comparison: " + isEqual);
        // String length
        int length = str3.length();
        System.out.println("String length: " + length);
        // String to char array
        char[] charArray = str3.toCharArray();
        System.out.println("String to char array: " + java.util.Arrays.toString(charArray));
        // char array to string
        String str6 = new String(charArray);
        System.out.println("Char array to string: " + str6);
        // String to int
        String str7 = "100";
        int num11 = Integer.parseInt(str7); // string to int
        System.out.println("String to int: " + num11);
        // int to string
        int num12 = 100;
        String str8 = Integer.toString(num12); // int to string
        System.out.println("Int to string: " + str8);
        // String to double
        String str9 = "100.5";
        double num13 = Double.parseDouble(str9); // string to double
        System.out.println("String to double: " + num13);
    }
}