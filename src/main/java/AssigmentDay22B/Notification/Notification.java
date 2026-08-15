package AssigmentDay22B.Notification;

public class Notification {

    protected String recipient;
    protected String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String send() {

        return "Sending notification to "
                + recipient + ": "
                + message;
    }
}