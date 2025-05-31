public class ForLoop {
    public static void main(String[] args) {
        // for loop = executes a block of code a limited amount of times
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
        System.out.println("Happy New Year!");
        // while loop = executes a block of code while a condition is true
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i -= 2;
        }
        System.out.println("Happy New Year!");
        // do-while loop = executes a block of code once, then repeats while a condition is true
        int j = 10;
        do {
            System.out.println(j);
            j -= 2;
        } while (j >= 0);
        System.out.println("Happy New Year!");
        // enhanced for loop = iterates through elements in an array or collection
        String[] animals = { "cat", "dog", "rat", "bird" };
        for (String animal : animals) {
            System.out.println(animal);
        }
        // nested for loop
        int rows = 5;
        int columns = 5;
        for (int row = 1; row <= rows; row++) {
            for (int column = 1; column <= columns; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // break statement = exits the loop immediately
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                break; // exits the loop when k is 5
            }
            System.out.println(k);
        }
        // continue statement = skips the current iteration and continues with the next one
        for (int l = 0; l < 10; l++) {
            if (l % 2 == 0) {
                continue; // skips even numbers
            }
            System.out.println(l);
        }
        // return statement = exits the method and returns a value
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                return; // exits the main method when m is 5
            }
            System.out.println(m);
        }
    }

}
