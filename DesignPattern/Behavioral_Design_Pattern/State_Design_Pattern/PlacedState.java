package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public class PlacedState implements OrderState {

    @Override
    public void placeOrder(Order order) {
        System.out.println("Order is already placed.");
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled after placing.");
        order.setState(new CancelledState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order delivered successfully.");
        order.setState(new DeliveredState());
    }
}

