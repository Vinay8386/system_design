package DesignPattern.Creational_Design_Pattern.Factory_Design_Pattern;

public class EmailSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
