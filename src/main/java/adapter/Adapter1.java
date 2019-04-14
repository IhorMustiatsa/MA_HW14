package adapter;

public class Adapter1 extends CreateUpperCase implements UpperCase {

    @Override
    public void upperCase(String str) {
        doUpperCase(str);
    }
}
