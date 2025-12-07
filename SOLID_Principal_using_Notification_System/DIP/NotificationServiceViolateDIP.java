package SOLID_Principal_using_Notification_System.DIP;

import SOLID_Principal_using_Notification_System.OCP.EmailSender;

public class NotificationServiceViolateDIP {
    EmailSender emailSender = new EmailSender();
}
