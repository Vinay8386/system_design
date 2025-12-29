package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public class CreatedState implements OrderState{

    @Override
    public void placeOrder(Order order) {
        System.out.println("Order placed successfully.");
        order.setState(new PlacedState());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order cancelled.");
        order.setState(new CancelledState());
    }

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Order cannot be delivered before placing.");
    }
}
