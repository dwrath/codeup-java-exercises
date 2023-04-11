import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell Bob something mane: ");
        while(true){
            String userInput = scanner.nextLine();
            char last = userInput.charAt(userInput.length() - 1);
            if(Character.toString(last).equals("?")){
                System.out.println("Sure");
            } else if (Character.toString(last).equals("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.isBlank()) {
                System.out.println("Fine. Be that way!");
            }else {
                System.out.println("whatever");
            }
            if(Character.toString(last).equals("q")){
                return;
            }
        }

    }
}
