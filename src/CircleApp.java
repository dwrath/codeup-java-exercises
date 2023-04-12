import Shapes.Circle;
import util.Input;

import java.util.Scanner;

public class CircleApp {
  public static void main(String[] args) {
    Input input = new Input();
    Scanner scanner = new Scanner(System.in);
    Circle circle = new Circle(55);
    System.out.println(circle.getArea());
    System.out.println(circle.getCircumference());
    boolean cont = input.yesNo();
    while(cont){
      System.out.println("Enter radius: ");
      scanner.nextLine();
      int userInput = scanner.nextInt();
      circle = new Circle(userInput);
      System.out.println(circle.getArea());
      System.out.println(circle.getCircumference());
      cont = input.yesNo();
    }
  }

}
