package grades;

import util.Input;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for(int grade: grades){
            total += grade;
        }
        return total/grades.size();
    }
    @Override
    public String toString() {
        return grades.toString();
    }

}
