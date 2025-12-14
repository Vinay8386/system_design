package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

/**
 * NotificationProxy
 * -----------------
 * This class is a **Protection Proxy** implementation for the Notification System.
 *
 * ROLE IN PROXY PATTERN:
 * ---------------------
 * - Acts as a **gatekeeper** between the Client and the Real Notification Sender.
 * - Controls access to the real sender based on user permissions.
 *
 * IMPORTANT:
 * ----------
 * - Client never calls the real sender directly.
 * - Client holds a reference of type `NotificationSender`,
 *   but the actual object is this Proxy.
 *
 * WHY PROXY IS NEEDED HERE:
 * ------------------------
 * We want to:
 *  - Check user role (ADMIN / NON-ADMIN)
 *  - Block unauthorized users
 *  - WITHOUT modifying the real notification sender
 *
 * This keeps:
 *  - Real sender clean (Single Responsibility)
 *  - Client unaware of access rules
 *
 * FLOW:
 * -----
 * Client
 *   ↓
 * NotificationProxy.send()
 *   ↓
 * [Permission Check]
 *   ↓ (if allowed)
 * Real NotificationSender.send()
 */
public class NotificationProxy implements NotificationSender {

    /**
     * Reference to the real notification sender.
     *
     * This could be:
     *  - EmailSender
     *  - SmsSender
     *  - PushSender
     *
     * Proxy delegates the actual work to this object.
     */
    private final NotificationSender realSender;

    /**
     * Role of the user trying to send the notification.
     * Used by the proxy to decide whether access should be granted.
     */
    private final String role;

    /**
     * Creates a NotificationProxy.
     *
     * @param realSender the actual notification sender
     *                   (this is the REAL object being protected)
     * @param userRole   role of the user (e.g., ADMIN, USER)
     */
    public NotificationProxy(NotificationSender realSender, String userRole) {
        this.realSender = realSender;
        this.role = userRole;
    }

    /**
     * Sends a notification message.
     *
     * PROXY LOGIC:
     * ------------
     * 1. First, the proxy checks whether the user has permission.
     * 2. If user is NOT ADMIN → block the request.
     * 3. If user IS ADMIN → forward the call to the real sender.
     *
     * NOTE:
     * -----
     * The real sender has NO idea that:
     *  - a role check happened
     *  - a proxy exists
     *
     * This is the core benefit of the Proxy Pattern.
     *
     * @param msg the notification message
     */
    @Override
    public void send(String msg) {
        if ("USER".equals(role) && realSender instanceof SmsNotificationSender) {
            System.out.println("USER not allowed to send SMS");
            return;
        }
        realSender.send(msg);
    }
}

