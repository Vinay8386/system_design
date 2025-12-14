package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

public class LazyNotificationProxy implements NotificationSender {

    private NotificationSender realSender;

    @Override
    public void send(String msg) {
        if (realSender == null) {
            System.out.println("Creating Real Notification Sender...");
            realSender = new RealNotificationSender();
        }
        realSender.send(msg);
    }
}

