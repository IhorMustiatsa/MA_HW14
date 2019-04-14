package abstractFactory;

public class SamsungDeviceFactory implements DeviceFactory {
    @Override
    public Monitor getMonitor(){
        return new SamsungMonitor();
    }
    @Override
    public Notebook getNotebook(){
        return new SamsungNotebook();
    }
}
