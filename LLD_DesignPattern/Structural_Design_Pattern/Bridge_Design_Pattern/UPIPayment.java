package LLD_DesignPattern.Structural_Design_Pattern.Bridge_Design_Pattern;

public class UPIPayment implements PaymentMethod {

    @Override
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

