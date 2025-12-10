package DesignPattern.Behavioral_Design_Pattern.Strategy.PaymentStrategy;

public class PayByCreditCard implements PayStrategy{

    private String card_no;
    private int cvv;

    public PayByCreditCard(String card_no, int cvv) {
        this.card_no = card_no;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(double paymentAmount) {
        //Payment logic through Credit-card
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        //Collect the record of payment done via credit card
    }
}
