package grades;

public class StudentsTest {
    public static void main(String[] args) {
        Student student = new Student("Bob");
        student.addGrade(90);
        student.addGrade(80);

        System.out.println(student.getName());
        System.out.println(student.getGradeAverage());
    }
}
