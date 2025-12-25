package DesignPattern.Structural_Design_Pattern.Facase_Design_Pattern;

public class ToppingsDecorator extends FoodDecorator {

    public ToppingsDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Toppings";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 50;
    }
}

