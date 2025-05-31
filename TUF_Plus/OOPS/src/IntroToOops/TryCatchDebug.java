public class TryCatchDebug {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        // int num3=num1/num2; // This will cause an ArithmeticException (division by zero)
        // System.out.println("Result: " + num3);
        try{
            int num3=num1/num2;
            System.out.println("Result: " + num3);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
