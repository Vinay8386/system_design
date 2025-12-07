package SOLID_Principal_using_Notification.OCP;

public class NotificationServiceWithOCP {
    void send(NotificationSender sender, String message){
        sender.send(message);
    }
}
