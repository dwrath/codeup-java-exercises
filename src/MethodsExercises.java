import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Addition: "+add(1,2));
        System.out.println("subtraction: "+sub(10,3));
        System.out.println("Multiplication: "+ mul(10,3));
        System.out.println("Division: "+div(10,3));
        System.out.println("Mod: "+mod(10,3));
        System.out.println("multiply: "+multiply(10,3));
        System.out.println("subtraction: "+sub(10,3));
        System.out.println("Get Integer: "+getInteger(1,10));
        System.out.println("Factorial: "+ factorial(10));
    }
    public static long add(long x, long y){
        return x+y;
    }
    public static long sub(long x, long y){
        return x-y;
    }
    public static long mul(long x, long y){
        return x*y;
    }
    public static double div(long x, long y){
        return x/y;
    }
    public static long mod(long x, long y){
        return x % y;
    }
    public static long multiply(long a, long b) {
        if (b == 0) {
            return 0;
        } else {
            return a + multiply(a, b - 1);
        }
    }
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int input = scanner.nextInt();
        if(input<=10 && input >= 1){
            return input;
        }else{
            input =  getInteger(min, max);
        }
        return input;
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}
