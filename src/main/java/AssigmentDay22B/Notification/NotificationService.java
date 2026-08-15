package AssigmentDay22B.Notification;

public class NotificationService {

    public static int processBatch(
            Notification[] notifications) {

        if (notifications == null) {
            return 0;
        }

        int totalProcessed = 0;

        for (int i = 0; i < notifications.length; i++) {

            if (notifications[i] != null) {

                System.out.println(
                        notifications[i].send());

                totalProcessed++;
            }
        }

        return totalProcessed;
    }
}