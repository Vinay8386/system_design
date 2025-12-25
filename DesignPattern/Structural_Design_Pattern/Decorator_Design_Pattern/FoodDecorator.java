package DesignPattern.Structural_Design_Pattern.Decorator_Design_Pattern;

public abstract class FoodDecorator implements FoodItem{

    protected FoodItem foodItem;

    public FoodDecorator(FoodItem foodItem){
        this.foodItem=foodItem;
    }
}
