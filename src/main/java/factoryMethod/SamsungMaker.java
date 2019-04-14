package factoryMethod;

public class SamsungMaker implements PhoneMaker {

    @Override
    public Phone getPhone() {
        return Samsung.getInstance();
    }
}