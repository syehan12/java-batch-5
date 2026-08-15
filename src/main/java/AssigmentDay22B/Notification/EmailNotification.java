package AssigmentDay22B.Notification;

public class EmailNotification extends Notification {

    private String subject;

    public EmailNotification(
            String recipient,
            String subject,
            String message) {

        super(recipient, message);

        this.subject = subject;
    }

    @Override
    public String send() {

        return "Sending EMAIL to "
                + recipient
                + " | Subject: "
                + subject
                + " | Body: "
                + message;
    }
}