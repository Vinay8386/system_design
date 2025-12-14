package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

/**
 * NotificationSender
 * -------------------
 * This is the COMMON INTERFACE for the Notification System.
 *
 * PURPOSE:
 * --------
 * 1. It defines a common contract for sending notifications.
 * 2. Both:
 *      - Real notification senders (EmailSender, SmsSender, PushSender)
 *      - Proxy notification senders (ProtectionProxy, VirtualProxy, LoggingProxy)
 *    implement this interface.
 *
 * WHY THIS IS IMPORTANT FOR PROXY:
 * --------------------------------
 * The Client always talks to this interface, NOT to concrete classes.
 *
 * This allows:
 *  - Client → Proxy → Real Sender flow
 *  - Client to remain unaware whether it is calling:
 *      a) a real sender
 *      b) a proxy sender
 *
 * This is the key idea of the Proxy Design Pattern.
 *
 * FLOW:
 * -----
 * Client
 *   ↓
 * NotificationSender (interface reference)
 *   ↓
 * Proxy (adds extra behavior)
 *   ↓
 * Real Sender (actual notification sending)
 *
 * BENEFITS:
 * ---------
 * - Loose coupling
 * - Open/Closed Principle
 * - Easy to add new proxy behaviors (security, logging, caching, lazy loading)
 */
public interface NotificationSender {

    /**
     * Sends a notification message.
     *
     * IMPLEMENTATION DETAILS:
     * -----------------------
     * - In Real Sender: This method performs the actual sending logic.
     * - In Proxy Sender: This method adds extra behavior
     *   (validation, permission checks, lazy initialization, logging)
     *   and then delegates the call to the real sender.
     *
     * @param msg the notification message to be sent
     */
    void send(String msg);
}

