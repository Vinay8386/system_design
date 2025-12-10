package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

/**
 * Client:
 * -------
 * Client no longer hardcodes ModernNotificationFactory.
 * The client simply asks FactoryProvider to supply a factory based on input or config.
 * This keeps the client fully closed for modification.
 */
public class Client {
    public static void main(String[] args) {

        // In real projects this comes from config, env variable, DB, CLI argument
        String selectedMode = "MODERN";   // You can change this without touching client code

        // Get correct family using FactoryProvider
        NotificationFactory factory = FactoryProvider.getFactory(selectedMode);

        // Use the family of related objects
        NotificationSender email = factory.createEmailSender();
        NotificationSender push = factory.createPushSender();

        email.send("Welcome Vinay!");
        push.send("Your session starts in 5 minutes");
    }
}


