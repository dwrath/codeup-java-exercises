package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
         this.scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.println("Enter string: ");
        return scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Continue? ");
        this.scanner.nextLine();
        String answer = this.scanner.nextLine();
        return answer.equals("y") || answer.equals("yes");
    }
    public int getInt(int min, int max){
        System.out.print("Enter a number between "+ max+ " and "+ min+": ");
        int input = this.scanner.nextInt();
        if(input<=max && input >= min){
            return input;
        }else{
            return getInt(min, max);
        }
    }
    public int getInt(){
        return scanner.nextInt();
    }
    public int getInt(String prompt){
        System.out.println(prompt);
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        System.out.print("Enter a number between "+ max+ " and "+ min+": ");
        double input = this.scanner.nextDouble();
        if(input <= max && input >= min){
            return input;
        }else{
            return getDouble(min, max);
        }
    }
}
