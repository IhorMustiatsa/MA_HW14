package adapter;

public class ApplicationAdapter {
    public static void main(String[] args) {
        UpperCase upperCase = new Adapter1();
        upperCase.upperCase("hello");

        UpperCase upperCase2 = new Adapter2();
        upperCase2.upperCase("hello2");
    }

}
