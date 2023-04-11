import java.util.Scanner;

public class HighLow {
    public static double highLow(){
        Scanner scanner = new Scanner(System.in);
        int high = 100;
        int low = 1;
        int range = high-low +1;
        double randNum = (Math.random()*range)+1;
        while(true){
            int maxGuesses = 10;
            int guessCount = 0;
            System.out.println("Guess: ");
            int input = scanner.nextInt();
            if(input < randNum){
                System.out.println("higher");
            }else if(input > randNum){
                System.out.println("lower");
            }else{
                System.out.println("good guess");
            }
            guessCount++;
            if(guessCount >= maxGuesses){
             System.out.print("out of guesses");
            }
        }
    }
}
