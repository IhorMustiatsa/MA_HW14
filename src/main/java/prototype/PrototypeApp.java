package prototype;

public class PrototypeApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Vasya", "Black");
        System.out.println(cat.toString());
        Cat copy = (Cat) cat.copy();
        System.out.println(copy.toString());
    }
}
