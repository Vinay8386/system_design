package DesignPattern.Behavioral_Design_Pattern.Strategy_Design_Pattern;

public class PaymentStrategyFactory {

    public static PaymentStrategy getPaymentStrategy(String paymentType){

        return switch (paymentType.toUpperCase()){

            case "UPI" -> new UpiPayment();
            case "CARD" -> new CardPayment();
            case "NETBANKING" -> new NetBankingPayment();
            default -> throw new IllegalArgumentException("Invalid payment type");
        };
    }
}
