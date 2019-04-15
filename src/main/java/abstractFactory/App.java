package abstractFactory;

public class App {
    public static void main(String[] args) {
        DeviceFactory samsungFactory = new SamsungDeviceFactory();
        samsungFactory.getMonitor().show();
        samsungFactory.getNotebook().start();
        DeviceFactory sonyFactory = new SonyDeviceFactory();
        sonyFactory.getNotebook().start();
        sonyFactory.getMonitor().show();
    }
}
