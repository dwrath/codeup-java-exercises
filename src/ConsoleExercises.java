
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("the value of pi is approximately %.2f", pi);

        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        int userNum = scanner.nextInt();

//        System.out.print("Enter 3 words: ");
//        String word1 = scanner.next();
//        String word2 =scanner.next();
//        String word3 = scanner.next();
//        System.out.println("enter mane");
//        String words = scanner.nextLine();
////        System.out.println(word1 +'\n'+ word2 +'\n'+ word3);
//        System.out.println(words);

        System.out.println("enter length : ");
        String length = scanner.nextLine();
        System.out.println("Enter width");
        String width = scanner.nextLine();

        int perimeter = Integer.parseInt(length) + Integer.parseInt(length)+Integer.parseInt(width)+Integer.parseInt(width);
        int area = Integer.parseInt(length)* Integer.parseInt(width);

        System.out.println(perimeter);
        System.out.println(area);


    }
}
