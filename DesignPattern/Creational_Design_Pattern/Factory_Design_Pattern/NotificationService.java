package DesignPattern.Creational_Design_Pattern.Factory_Design_Pattern;

public class NotificationService {

    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void send(String message) {
        sender.send(message);
    }
}

