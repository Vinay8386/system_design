package DesignPattern.BehavioralDesign.Strategy.PaymentStrategy;

public class PaymentContext {
    private PayStrategy payStrategy;

    public void setPayStrategy(PayStrategy payStrategy){
        this.payStrategy=payStrategy;
    }

    public void processPayment(double amount) {
        payStrategy.pay(amount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }
}
