package DesignPattern.Creational_Design_Pattern.Proxy_Design_Pattern;

public class RateLimitNotificationProxy implements NotificationSender{

    private final NotificationSender realSender;
    private long lastSentTime = 0;

    public RateLimitNotificationProxy(NotificationSender realSender){
        this.realSender=realSender;
    }

    @Override
    public void send(String msg) {
        long now = System.currentTimeMillis();

        if(now - lastSentTime <1000){
            System.out.println("Rate Limit Exceeded! Wait before sending again.");
            return;
        }

        lastSentTime=now;
        realSender.send(msg);
    }
}
