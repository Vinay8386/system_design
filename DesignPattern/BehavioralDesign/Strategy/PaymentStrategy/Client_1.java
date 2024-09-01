package DesignPattern.BehavioralDesign.Strategy.PaymentStrategy;

//want to process payment through credit card
public class Client_1 {

    public static void main(String[] args) {

        PaymentContext context=new PaymentContext();

        context.setPayStrategy(new PayByCreditCard("1234-5678-9012",200));

        context.processPayment(5000);

    }
}
