package DesignPattern.Creational_Design_Pattern.Factory_Design_Pattern;

/**
 * Client class demonstrating how the Factory Pattern works.
 *
 * Key Points:
 * - The client does not create concrete sender objects.
 * - The client only requests a sender from the Factory.
 * - The Factory decides which concrete class to instantiate.
 * - The Factory creates the object internally.
 * - The Factory returns the object as the interface type.
 * - The client receives only NotificationSender, not the actual implementation.
 */
public class Client {

    public static void main(String[] args) {

        /**
         * STEP 1: Client requests a sender from the factory.
         *
         * The client passes "Email" to the factory.
         * The client does not write: new EmailSender().
         *
         * Inside NotificationFactory:
         * - It decides which sender to use based on input.
         * - It creates the concrete object internally.
         * - It returns a NotificationSender reference.
         *
         * So the client only gets the fully created object.
         */
        NotificationSender sender = NotificationFactory.createSender("Email");

        /**
         * STEP 2: Dependency Injection
         *
         * The client injects the sender object into the service.
         * NotificationService depends on NotificationSender (interface),
         * not on any specific implementation.
         */
        NotificationService service = new NotificationService(sender);

        /**
         * STEP 3: Using the service
         *
         * The service internally uses the concrete sender
         * that the factory created.
         *
         * The client does not know or care which sender it is.
         */
        service.send("Hello Vinay, this is factory pattern!");
    }
}

