package factoryMethod;

public class SonyMaker implements PhoneMaker {

    @Override
    public Phone getPhone() {
        return new Sony(true);
    }
}
