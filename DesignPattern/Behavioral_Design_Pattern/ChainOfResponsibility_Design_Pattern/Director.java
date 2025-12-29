package DesignPattern.Behavioral_Design_Pattern.ChainOfResponsibility_Design_Pattern;

public class Director extends AbstractApprover {

    @Override
    public void approveOrder(int amount) {
        if (amount <= 5000) {
            System.out.println("Director approved order of ₹" + amount);
        } else if (next != null) {
            next.approveOrder(amount);
        }
    }
}

