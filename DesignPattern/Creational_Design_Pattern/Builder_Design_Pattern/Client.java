package DesignPattern.Creational_Design_Pattern.Builder_Design_Pattern;

public class Client {
    public static void main(String[] args) {

        Notification notification = new Notification.Builder("vinay@example.com", "System alert")
                .subject("Greetings")
                .bcc("testing@gmail.com")
                .cc("abc@gmail.com")
                .priority(10)
                .build();

        System.out.println(notification);

        // Another notification with minimal fields
        Notification simpleNotification = new Notification.Builder("alice@example.com", "Hi Alice!")
                .build();

        System.out.println(simpleNotification);
    }
}

