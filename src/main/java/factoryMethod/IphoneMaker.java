package factoryMethod;

public class IphoneMaker implements PhoneMaker {

    @Override
    public Phone getPhone() {
        return new Iphone();
    }
}