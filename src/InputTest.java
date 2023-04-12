import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input1 = new Input();
        System.out.println("Your string is: " + input1.getString());
        input1.getInt(1,10);
        input1.getDouble(1.3,10.3);
        boolean cont = input1.yesNo();
        while(cont){
            System.out.print("Enter string: ");
            System.out.println("Your string is: " + input1.getString());
            input1.getInt(1,10);
            input1.getDouble(1.3,10.3);
            cont = input1.yesNo();
        }

    }
}
