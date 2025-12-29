package DesignPattern.Behavioral_Design_Pattern.Strategy_Design_Pattern;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    /*
    //Constructor Injection
    public PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }*/

    //Setter Injection
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}

