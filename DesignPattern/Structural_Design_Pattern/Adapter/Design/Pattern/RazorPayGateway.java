package DesignPattern.Structural_Design_Pattern.Adapter.Design.Pattern;

//Adaptee (Third-Party Class)
public class RazorPayGateway {

    public void payAmount(int rupees) {
        System.out.println("Paid ₹" + rupees + " using RazorPay");
    }
}

