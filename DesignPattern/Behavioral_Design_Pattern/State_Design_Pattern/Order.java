package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public class Order {

    private OrderState state;

    public Order() {
        // Initial state
        this.state = new CreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void placeOrder() {
        state.placeOrder(this);
    }

    public void cancelOrder() {
        state.cancelOrder(this);
    }

    public void deliverOrder() {
        state.deliverOrder(this);
    }
}

