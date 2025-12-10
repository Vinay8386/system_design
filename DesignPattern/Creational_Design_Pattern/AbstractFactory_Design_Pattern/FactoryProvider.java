package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

public class FactoryProvider {

    public static NotificationFactory getFactory(String mode) {

        return switch (mode.toUpperCase()) {
            case "MODERN" -> new ModernNotificationFactory();
            case "LEGACY" -> new LegacyNotificationFactory();
            default -> throw new IllegalArgumentException("Unknown factory type: " + mode);
        };
    }
}

