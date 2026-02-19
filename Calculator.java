public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // This calls the add method below
        int result = add(a, b);
        
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
    }

    // This is the logic Account B will try to "break"
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
