package DesignPattern.Behavioral_Design_Pattern.Observer_Design_Pattern;

public class EmailNotification implements OrderObserver {

    @Override
    public void update(String orderStatus) {
        System.out.println("Email sent: Order is " + orderStatus);
    }
}

