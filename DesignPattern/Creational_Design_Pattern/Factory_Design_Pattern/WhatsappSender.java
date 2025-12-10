package DesignPattern.Creational_Design_Pattern.Factory_Design_Pattern;

public class WhatsappSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Sending WHATSAPP: " + message);
    }
}
