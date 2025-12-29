package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public class CancelledState implements OrderState {

    @Override
    public void placeOrder(Order order) {
        System.out.println("Cancelled order cannot be placed again.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order is already cancelled.");
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Cancelled order cannot be delivered.");
    }
}

