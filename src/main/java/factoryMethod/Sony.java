package factoryMethod;

public class Sony implements Phone {
    private boolean isOn;

    public Sony(boolean ready) {
        this.isOn = ready;
        isReadyToCreate();
    }

    private void isReadyToCreate() {
        System.out.println("Ready to create");
    }

    @Override
    public void createPhone() {
        System.out.println("Sony is building");
    }
}
