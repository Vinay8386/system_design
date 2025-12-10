package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

/**
 * Modern Notification Factory:
 * ----------------------------
 * Creates notification senders used by modern systems.
 * Modern systems prefer Email + Push.
 */
public class ModernNotificationFactory implements NotificationFactory {

    @Override
    public NotificationSender createEmailSender() {
        return new EmailSender();
    }

    @Override
    public NotificationSender createSmsSender() {
        // Modern platform may not support SMS — return default implementation
        return new SmsSender();
    }

    @Override
    public NotificationSender createPushSender() {
        return new PushSender();
    }
}

