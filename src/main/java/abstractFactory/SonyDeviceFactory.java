package abstractFactory;

public class SonyDeviceFactory implements DeviceFactory {
    @Override
    public Notebook getNotebook() {
        return new SonyNotebook();
    }

    @Override
    public Monitor getMonitor() {
        return new SonyMonitor();
    }
}
