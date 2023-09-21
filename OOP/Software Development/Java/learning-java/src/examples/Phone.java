package examples;

// Class to store into Box<>

public class Phone {

    // Properties
    private final String brand;

    // Constructor

    public Phone(String brand) {
        this.brand = brand;
    }

    // Getter

    public String getBrand() {
        return brand;
    }

    // toString

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

