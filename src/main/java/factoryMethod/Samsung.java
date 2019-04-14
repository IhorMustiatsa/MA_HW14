package factoryMethod;

public class Samsung implements Phone {
    private static Samsung instance = null;

    private Samsung() {
    }

    public static Samsung getInstance() {
        if (instance == null) {
            synchronized (Samsung.class) {
                if (instance == null) {
                    instance = new Samsung();
                }
            }
        }
        return instance;
    }

    @Override
    public void createPhone() {
        System.out.println("Samsung is building");
    }
}
