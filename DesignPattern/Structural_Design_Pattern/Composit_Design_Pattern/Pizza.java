package DesignPattern.Structural_Design_Pattern.Composit_Design_Pattern;

public class Pizza implements FoodItem {

    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public void showDetails() {
        System.out.println("Pizza : ₹200");
    }
}

