public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5]; // declaring an array of integers with size 5
        arr[0] = 10; // assigning value to the first element
        arr[1] = 20; // assigning value to the second element
        arr[2] = 30; // assigning value to the third element
        arr[3] = 40; // assigning value to the fourth element
        arr[4] = 50; // assigning value to the fifth element
        // printing the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        // length of the array
        System.out.println("Length of the array: " + arr.length);
        // accessing elements using for-each loop
        System.out.println("Accessing elements using for-each loop:");
        for (int element : arr) {
            System.out.println("Element: " + element);
        }
        // multidimensional array
        int[][] multiArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // printing the multidimensional array
        System.out.println("Multidimensional array:");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
        // accessing elements in a multidimensional array
        System.out.println("Accessing elements in a multidimensional array:");
        System.out.println("Element at index [0][0]: " + multiArr[0][0]);
        System.out.println("Element at index [1][2]: " + multiArr[1][2]);
        System.out.println("Element at index [2][1]: " + multiArr[2][1]);
        // array of objects
        // Student[] students = new Student[3];
    }
    
}
