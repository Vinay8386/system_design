package DesignPattern.Behavioral_Design_Pattern.Observer_Design_Pattern;

public class CustomerNotification implements OrderObserver {

    @Override
    public void update(String orderStatus) {
        System.out.println("Customer notified: Order is " + orderStatus);
    }
}

