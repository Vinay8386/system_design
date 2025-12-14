package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

import java.util.List;

/**
 * Client interacts with NotificationSender through Proxy.
 * Client does NOT create real object directly.
 */
public class Client {

    public static void main(String[] args) {

        List<NotificationSender> adminSenders =
                NotificationSenderFactory.createSenders("ADMIN");

        adminSenders.forEach(sender ->
                sender.send("Admin notification"));

        System.out.println("----");

        List<NotificationSender> userSenders =
                NotificationSenderFactory.createSenders("USER");

        userSenders.forEach(sender ->
                sender.send("User notification"));
    }
}


