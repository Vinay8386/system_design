package DesignPattern.Behavioral_Design_Pattern.ChainOfResponsibility_Design_Pattern;

public class CEO extends AbstractApprover {

    @Override
    public void approveOrder(int amount) {
        System.out.println("CEO approved order of ₹" + amount);
    }
}

