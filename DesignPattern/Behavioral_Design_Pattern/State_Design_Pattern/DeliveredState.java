package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public class DeliveredState implements OrderState {

    @Override
    public void placeOrder(Order order) {
        System.out.println("Order already delivered. Cannot place again.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Delivered order cannot be cancelled.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order is already delivered.");
    }
}

