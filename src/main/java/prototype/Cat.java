package prototype;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Cat implements Copyable {
    private String name;
    private String color;

    @Override
    public Object copy() {
        return new Cat(name, color);
    }
}
