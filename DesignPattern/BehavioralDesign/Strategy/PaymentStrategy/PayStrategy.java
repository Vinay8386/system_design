package DesignPattern.BehavioralDesign.Strategy.PaymentStrategy;

public interface PayStrategy {
    boolean pay(double paymentAmount); //Method for payment logic
    void collectPaymentDetails();   //Method to collect payment record
}
