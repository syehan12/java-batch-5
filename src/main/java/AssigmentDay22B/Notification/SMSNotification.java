package AssigmentDay22B.Notification;

public class SMSNotification extends Notification {

    private String phoneNumber;

    public SMSNotification(
            String recipient,
            String phoneNumber,
            String message) {

        super(recipient, message);

        this.phoneNumber = phoneNumber;
    }

    @Override
    public String send() {

        String truncatedMessage = message;

        if (message != null && message.length() > 20) {
            truncatedMessage =
                    message.substring(0, 17) + "...";
        }

        return "Sending SMS to "
                + phoneNumber
                + " ("
                + recipient
                + "): "
                + truncatedMessage;
    }
}