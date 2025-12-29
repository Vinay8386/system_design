package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public interface OrderState {
    void placeOrder(Order order);
    void cancelOrder(Order order);
    void deliverOrder(Order order);
}
