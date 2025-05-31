import java.util.Scanner;
// This code snippet demonstrates various conditional statements in Java.
public class ConditionalStatements {
    
    public static void main(String[] args) {

        // if-else statement
        // This code checks if a given number is even or odd.
        int number = 10;
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        // if-else-if ladder
        // This code checks if a given number is positive, negative, or zero.
        int number1 = 10;
        if (number1 > 0) {
            System.out.println("Positive number");
        } else if (number1 < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }

        // nested if statement
        // This code checks if a given number is positive, negative, or zero.
        int number2 = 10;
        if (number2 >= 0) {
            if (number2 == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positive number");
            }
        } else {
            System.out.println("Negative number");
        }

        // switch statement
        // This code demonstrates the use of the switch statement to check the day of the week.
        int week = 3;
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid week day");
        }
        // else if clause
        // grades example
        // This code takes a grade as input and prints the corresponding grade level.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();
        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
    }
}
