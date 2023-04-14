import java.util.Arrays;
import Person.Person;
public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Jay");
        people[1] = new Person("John");
        people[2] = new Person("James");
       people = addPerson(people, new Person("Dale"));


       for(Person person: people){
           System.out.println(person.getName());
       }


    }
    public static Person[] addPerson(Person[] arr, Person person){
        int n = arr.length;
        Person[] newArr = new Person[n+1];
        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[n] = person;
        return newArr;
    }
}
