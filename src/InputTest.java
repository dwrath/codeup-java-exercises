import util.Input;
public class InputTest {
    public static void main(String[] args) {
        Input input1 = new Input();
        System.out.println(input1.getString());
        input1.getInt(1,10);
        input1.getDouble(1.3,10.3);
        input1.yesNo();
    }
}
