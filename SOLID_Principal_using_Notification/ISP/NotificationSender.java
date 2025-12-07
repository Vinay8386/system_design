package SOLID_Principal_using_Notification.ISP;

interface NotificationSender {
    void sendText(String msg);
    void sendImage(byte[] img);
    void sendActionButton(String label);
}
