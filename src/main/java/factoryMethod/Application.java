package factoryMethod;

public class Application {
    public static void main(String[] args) {
        PhoneMaker phoneMaker = CreatePhone.createPhone("Samsung");
        Phone phone = phoneMaker.getPhone();
        phone.createPhone();
    }
}
