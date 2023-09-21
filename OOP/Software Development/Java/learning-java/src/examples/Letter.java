package examples;

public class Letter {

    // Properties

    private final String sender;

    // Constructor

    public Letter(String sender) {
        this.sender = sender;
    }

    // Getter

    public String getSender() {
        return sender;
    }

    // toString

    @Override
    public String toString() {
        return "Letter{" +
                "sender='" + sender + '\'' +
                '}';
    }
}


