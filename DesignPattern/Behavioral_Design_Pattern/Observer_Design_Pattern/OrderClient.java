package DesignPattern.Behavioral_Design_Pattern.Observer_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        Order order = new Order();

        order.registerObserver(new CustomerNotification());
        order.registerObserver(new DeliveryPartnerNotification());
        order.registerObserver(new EmailNotification());

        order.setOrderStatus("PLACED");
        order.setOrderStatus("OUT_FOR_DELIVERY");
        order.setOrderStatus("DELIVERED");
    }
}

