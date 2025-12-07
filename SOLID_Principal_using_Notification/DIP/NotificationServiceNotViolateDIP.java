package SOLID_Principal_using_Notification.DIP;

import SOLID_Principal_using_Notification.OCP.NotificationSender;

public class NotificationServiceNotViolateDIP {

    private final NotificationSender sender;

    NotificationServiceNotViolateDIP(NotificationSender sender) {
        this.sender = sender;
    }

    void send(String msg) {
        sender.send(msg);
    }
}
