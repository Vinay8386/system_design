package DesignPattern.Behavioral_Design_Pattern.Strategy_Design_Pattern;

public class UpiPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

