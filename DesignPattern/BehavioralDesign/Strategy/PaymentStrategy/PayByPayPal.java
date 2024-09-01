package DesignPattern.BehavioralDesign.Strategy.PaymentStrategy;

public class PayByPayPal implements PayStrategy{

    private String email;

    public PayByPayPal(String email) {
        this.email = email;
    }

    @Override
    public boolean pay(double paymentAmount) {
        //Payment logic through PayPal
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        //Collect the record of payment done via PayPal
    }
}
