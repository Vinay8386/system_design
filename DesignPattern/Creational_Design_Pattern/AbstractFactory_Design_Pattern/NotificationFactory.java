package DesignPattern.Creational_Design_Pattern.AbstractFactory_Design_Pattern;

/**
 * Abstract Factory:
 * ------------------
 * Declares methods for creating families of related products.
 *
 * In this case, a factory family can create:
 * - Email Sender
 * - SMS Sender
 * - Push Sender
 *
 * Concrete factories decide which concrete sender to return.
 */
public interface NotificationFactory {

    NotificationSender createEmailSender();

    NotificationSender createSmsSender();

    NotificationSender createPushSender();
}

