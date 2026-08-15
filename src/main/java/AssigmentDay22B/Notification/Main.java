package AssigmentDay22B.Notification;

public class Main {
    public static void main(String[] args) {

        Notification[] batch = new Notification[] {

                new EmailNotification(
                        "john@mail.com",
                        "Promo",
                        "Diskon 50% untuk Anda!"
                ),

                new SMSNotification(
                        "Budi",
                        "08123456789",
                        "Kode OTP Anda adalah 4321"
                ),

                new Notification(
                        "Alice",
                        "Selamat datang di aplikasi kami"
                )
        };

        int totalSent =
                NotificationService.processBatch(batch);

        System.out.println(
                "Total diproses: " + totalSent
        );
    }
}