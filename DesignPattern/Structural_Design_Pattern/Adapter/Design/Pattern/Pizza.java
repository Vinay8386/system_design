package DesignPattern.Structural_Design_Pattern.Adapter.Design.Pattern;

//The concrete component in the object we are going to dynamically add new behaviour to . It extends component.
public class Pizza implements FoodItem {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
