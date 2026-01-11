package LLD_DesignPattern.Structural_Design_Pattern.Composit_Design_Pattern;

public class Burger implements FoodItem {

    @Override
    public double getCost() {
        return 120;
    }

    @Override
    public void showDetails() {
        System.out.println("Burger : ₹120");
    }
}

