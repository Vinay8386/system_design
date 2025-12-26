package DesignPattern.Structural_Design_Pattern.Bridge_Design_Pattern;

public class OnlineOrder extends Order{

    public OnlineOrder(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    public void placeOrder(double amount) {
        System.out.println("Placing online order");
        paymentMethod.makePayment(amount);
    }
}
