package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

public class LegacyNotificationFactory implements NotificationFactory{
    @Override
    public NotificationSender createEmailSender() {
        throw new UnsupportedOperationException("Email not supported in legacy system");
    }

    @Override
    public NotificationSender createSmsSender() {
        return new SmsSender();
    }

    @Override
    public NotificationSender createPushSender() {
        throw new UnsupportedOperationException("Push not supported in legacy system");
    }
}
