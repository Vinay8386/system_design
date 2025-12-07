package SOLID_Principal_using_Notification_System.ISP;

interface NotificationSender {
    void sendText(String msg);
    void sendImage(byte[] img);
    void sendActionButton(String label);
}
