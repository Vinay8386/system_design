package DesignPattern.Structural_Design_Pattern.Facase_Design_Pattern;

public class ExtraCheeseDecorator extends FoodDecorator {

    public ExtraCheeseDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Extra Cheese";
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 40;
    }
}
