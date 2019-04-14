package factoryMethod;

public class SonyProxy implements Phone{
    private boolean ready;
    private Sony sony;

    public SonyProxy(boolean change) {
        this.ready = change;
    }

    @Override
    public void createPhone() {
        if (sony == null) {
            sony = new Sony(ready);
        }
        sony.createPhone();
    }
}
