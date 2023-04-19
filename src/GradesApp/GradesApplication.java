package GradesApp;

import grades.Student;

import java.util.HashMap;

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

    }
}
