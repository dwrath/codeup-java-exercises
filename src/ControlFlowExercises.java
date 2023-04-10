import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;

//        while(i < 15){
//            i++;
//            System.out.printf("%d ", i );
//        }
//        int j = 100;
//        do {
//            j -=5;
//            System.out.printf("%d ", j);
//        }while(j > 10);
//
//        int p = 2;
//        double result = 0;
//        double num = 2;
//        do {
//            result = Math.pow(num, p);
//            System.out.println(result);
//            num = result;
//        } while (result < 1000000);

//        for(int i =1; i < 100; i++){
//            if(i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            if (i%5==0) {
//                System.out.println("Buzz");
//            }
//            if(i%5==0 && i%3==0){
//                System.out.println("FizzBuzz");
//            }
//        }

//        System.out.println("enter an integer: ");
//        int userNum = scanner.nextInt();
//        int num = 1;
//        int squared = 0;
//        int cubed = 0;
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("-------|---------|-------");
//
//        for(int i = 0; i < userNum; i++){
//            squared = num*num;
//           cubed = num*num*num;
//            System.out.printf("%-7d| %-7d| %-7d\n",num,squared,cubed);
//            num++;
//        }
while(true){
    System.out.println("Enter a grade mane:");
    int userInput = scanner.nextInt();
    if(userInput >= 88 && userInput <=100){
        System.out.println("A");
    } else if (userInput <=87 && userInput >=80) {
        System.out.println("B");
    }else if(userInput >= 67 && userInput <= 79){
        System.out.println("C");
    }else if(userInput >=60 && userInput <=66){
        System.out.println("D");
    } else if (userInput <= 59) {
        System.out.println("F");
    }
    System.out.println("Continue: y/n");
    String answer = scanner.next();
    if(answer.equals("n")){
        return;
    }
}
}

}
