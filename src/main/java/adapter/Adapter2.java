package adapter;

public class Adapter2 implements UpperCase {
    CreateUpperCase upperCase = new CreateUpperCase();
    @Override
    public void upperCase(String str) {
        upperCase.doUpperCase("hello2");
    }
}
