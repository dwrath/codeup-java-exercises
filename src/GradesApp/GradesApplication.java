package GradesApp;

import grades.Student;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student Bob = new Student("Bob");
        Bob.addGrade(80);
        Bob.addGrade(99);
        Bob.addGrade(98);
        Bob.addGrade(88);
        students.put("BobtheGlob", Bob);

        Student Trey = new Student("Trey");
        Trey.addGrade(100);
        Trey.addGrade(99);
        Trey.addGrade(98);
        Trey.addGrade(88);
        students.put("itsTr3y", Trey);

        Student Alice = new Student("Alice");
        Alice.addGrade(10);
        Alice.addGrade(70);
        Alice.addGrade(85);
        Alice.addGrade(90);
        students.put("AliceinCodeLand", Alice);

        Student Damarcus = new Student("Damarcus");
        Damarcus.addGrade(80);
        Damarcus.addGrade(89);
        Damarcus.addGrade(78);
        Damarcus.addGrade(98);
        students.put("go_damarcus", Damarcus);

//        students.forEach((key, value) -> System.out.println(key + " : " + value.toString()));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!\n Here are the GitHub usernames of our students:");
        students.forEach((key, value) -> System.out.print("|" + key + "| "));

        while (true) {
            System.out.println("\n\nWhat student would you like to see more information on or enter 'all' for all class grades?\n");
            String userInput = scanner.nextLine();
            if (userInput.equals("all")) {
                students.forEach((key, value) -> System.out.println(key + " : " + value.toString()));
            } else {
                while (!students.containsKey(userInput)) {
                    System.out.printf("Sorry, no student found with the GitHub username of %s%n", userInput);
                    userInput = scanner.nextLine();
                }
                if (students.containsKey(userInput)) {
                    System.out.printf("Name: %s -Github Username: %s%n Current Average:%s%n Grades: %s%n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage(), students.get(userInput).toString());
                    System.out.println("Would you like to see another student?");
                    if (scanner.nextLine().equals("n")) {
                        System.out.println("Goodbye, and have a wonderful day!");
                        return;
                    }
                }
            }
        }
    }
}