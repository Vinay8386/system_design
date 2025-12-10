package DesignPattern.Behavioral_Design_Pattern.Strategy.PaymentStrategy;

public class Client_2 {
    public static void main(String[] args) {
        PaymentContext context=new PaymentContext();

        //Set the strategy
        context.setPayStrategy(new PayByPayPal("vinay@gmail.com"));

        //Execute task - process payment
        context.processPayment(1100);

        //Execute task - collect payment details
        context.collectPaymentDetails();
    }
}
