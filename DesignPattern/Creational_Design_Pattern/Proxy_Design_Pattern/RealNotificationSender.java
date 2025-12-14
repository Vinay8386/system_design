package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

/**
 * RealNotificationSender
 * ----------------------
 * This class represents the **REAL OBJECT** (also called Real Subject)
 * in the Proxy Design Pattern.
 *
 * ROLE IN PROXY PATTERN:
 * ---------------------
 * - Contains the **actual business logic** for sending notifications.
 * - Does NOT perform:
 *      - access control
 *      - permission checks
 *      - logging
 *      - caching
 *
 * WHY THIS CLASS IS KEPT SIMPLE:
 * ------------------------------
 * According to Single Responsibility Principle (SRP),
 * this class should focus on only ONE job:
 *
 *      → Sending the notification
 *
 * All additional responsibilities are handled by the Proxy.
 *
 * FLOW:
 * -----
 * Client
 *   ↓
 * NotificationProxy
 *   ↓
 * RealNotificationSender.send()
 *
 * IMPORTANT:
 * ----------
 * - This class does NOT know:
 *      - who the client is
 *      - whether permission was checked
 *      - whether a proxy exists
 *
 * This decoupling is the key advantage of the Proxy Pattern.
 */
public class RealNotificationSender implements NotificationSender {

    /**
     * Sends the notification message.
     *
     * REAL WORK:
     * ----------
     * This method performs the actual sending of notification.
     * In real-world systems, this could:
     *  - call an external API
     *  - send an email/SMS/push notification
     *
     * Proxy will call this method ONLY after
     * all validations and checks are successful.
     *
     * @param msg the notification message to be sent
     */
    @Override
    public void send(String msg) {
        System.out.println("Sending notification: " + msg);
    }
}

