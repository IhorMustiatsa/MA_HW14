package factoryMethod;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Iphone implements Phone {
    private String model;
    private String colour;

    public static class Builder {
        private Iphone iphone;

        public Builder() {
            iphone = new Iphone();
        }

        public Builder setModel(String model) {
            iphone.model = model;
            return this;
        }

        public Builder setColour(String colour) {
            iphone.colour = colour;
            return this;
        }

        public Iphone build() {
            return iphone;
        }
    }

    @Override
    public void createPhone() {
        System.out.println("iphone is creating");
    }
}
