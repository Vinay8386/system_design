package DesignPattern.Behavioral_Design_Pattern.Observer_Design_Pattern;

public class DeliveryPartnerNotification implements OrderObserver {

    @Override
    public void update(String orderStatus) {
        System.out.println("Delivery Partner notified: Order is " + orderStatus);
    }
}

