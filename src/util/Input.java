package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        System.out.print("Enter a string: ");
         this.scanner = new Scanner(System.in);
    }
    public String getString(){
        return scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Continue? ");
        this.scanner.nextLine();
        String answer = this.scanner.nextLine();
        if(answer.equals("y") || answer.equals("yes")){
            return true;
        }
        return false;
    }
    public int getInt(int min, int max){
        System.out.print("Enter a number between "+ max+ " and "+ min+": ");
        int input = this.scanner.nextInt();
        if(input<=max && input >= min){
            return input;
        }else{
            return input =  getInt(min, max);
        }
    }

    public double getDouble(double min, double max){
        System.out.print("Enter a number between "+ max+ " and "+ min+": ");
        double input = this.scanner.nextDouble();
        if(input <= max && input >= min){
            return input;
        }else{
            return input = getDouble(min, max);
        }
    }
}
