package SOLID_Principal_using_Notification.DIP;

import SOLID_Principal_using_Notification.OCP.EmailSender;

public class NotificationServiceViolateDIP {
    EmailSender emailSender = new EmailSender();
}
