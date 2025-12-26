package DesignPattern.Structural_Design_Pattern.Bridge_Design_Pattern;

public class InStoreOrder extends Order {

    public InStoreOrder(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void placeOrder(double amount) {
        System.out.println("Placing in-store order");
        paymentMethod.makePayment(amount);
    }
}

