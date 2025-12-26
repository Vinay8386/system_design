package DesignPattern.Structural_Design_Pattern.Bridge_Design_Pattern;

public class CardPayment implements PaymentMethod{
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}
