package factoryMethod;

public class CreatePhone {
    private static final String IPHONE = "Iphone";
    private static final String SAMSUNG = "Samsung";
    private static final String SONY = "Sony";

    public static PhoneMaker createPhone(String model) {
        if (model.equals("Iphone")) {
            return new IphoneMaker();
        } else if (model.equals("Samsung")) {
            return new SamsungMaker();
        } else if (model.equals("Sony")) {
            return new SonyMaker();
        } else {
            throw new RuntimeException(model + " id unknown model.");
        }
    }
}
