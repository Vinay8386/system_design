package DesignPattern.Creational_Design_Pattern.Factory_Design_Pattern;

/**
 * NotificationFactory is responsible for creating objects of different
 * NotificationSender types based on the input provided by the client.
 *
 * This class removes object creation responsibility from the client.
 *
 * Important Points:
 * - The client does not use 'new' to create sender objects.
 * - The factory decides which concrete class to instantiate.
 * - The factory creates the object internally.
 * - The factory returns the object as the NotificationSender interface type.
 * - Adding a new sender type requires change only in this factory,
 *   not in the client code.
 */
public class NotificationFactory {

    /**
     * Creates and returns an appropriate NotificationSender object
     * based on the provided notification type.
     *
     * How this method works:
     * - The client passes a simple string, like "EMAIL" or "SMS".
     * - The factory checks the type using switch expression.
     * - The factory creates the correct concrete class internally.
     * - The created object is returned as NotificationSender.
     *
     * Example:
     * If notificationType = "EMAIL":
     *   Factory creates: new EmailSender()
     *   Returns as: NotificationSender reference
     *
     * @param notificationType The type of notification channel requested.
     *                         Example: EMAIL, SMS, PUSH.
     * @return The appropriate NotificationSender implementation.
     * @throws IllegalArgumentException If an unknown notification type is passed.
     */
    public static NotificationSender createSender(String notificationType) {

        return switch (notificationType.toUpperCase()) {

            // Factory CREATES the EmailSender object here
            case "EMAIL" -> new EmailSender();

            // Factory CREATES the SmsSender object here
            case "SMS" -> new SmsSender();

            // Factory CREATES the PushSender object here
            case "PUSH" -> new PushSender();

            // If type doesn't match any known sender
            default -> throw new IllegalArgumentException(
                    "Unknown notification type: " + notificationType
            );
        };
    }
}

