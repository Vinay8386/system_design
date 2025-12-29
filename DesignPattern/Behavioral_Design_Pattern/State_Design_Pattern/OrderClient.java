package DesignPattern.Behavioral_Design_Pattern.State_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        Order order = new Order();

        order.placeOrder();   // Created → Placed
        order.deliverOrder(); // Placed → Delivered
        order.cancelOrder();  // Invalid operation
    }
}

