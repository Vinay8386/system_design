package DesignPattern.Structural_Design_Pattern.Bridge_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        PaymentMethod upi = new UPIPayment();
        Order order = new OnlineOrder(upi);

        order.placeOrder(500);
    }
}

