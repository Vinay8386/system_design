package DesignPattern.Structural_Design_Pattern.Adapter.Design.Pattern;

public abstract class FoodDecorator implements FoodItem {

    protected FoodItem foodItem;

    public FoodDecorator(FoodItem foodItem){
        this.foodItem=foodItem;
    }
}
