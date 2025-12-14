package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

/**
 * NotificationSenderFactory
 * -------------------------
 * Responsible ONLY for creating real notification sender objects.
 *
 * This removes concrete class creation from the Client.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Factory class responsible ONLY for creating NotificationSender objects.
 *
 * Client does NOT know which concrete class is created.
 * If tomorrow implementation changes, client remains unchanged.
 */
public class NotificationSenderFactory {

    public static List<NotificationSender> createSenders(String role) {

        List<NotificationSender> senders = new ArrayList<>();

        // Common for all roles
        senders.add(new NotificationProxy(new EmailNotificationSender(), role));
        senders.add(new NotificationProxy(new PushNotificationSender(), role));

        // Admin-only
        if ("ADMIN".equals(role)) {
            senders.add(new NotificationProxy(new SmsNotificationSender(), role));
        }

        return senders;
    }
}


