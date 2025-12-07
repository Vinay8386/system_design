package SOLID_Principal_using_Notification_System.OCP;

public class NotificationServiceWithOCP {

    private final NotificationSender sender;

    NotificationServiceWithOCP(NotificationSender sender) {
        this.sender = sender;
    }

    void send(String message) {
        sender.send(message);
    }
}
