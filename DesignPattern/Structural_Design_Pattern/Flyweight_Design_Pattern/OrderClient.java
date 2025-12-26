package DesignPattern.Structural_Design_Pattern.Flyweight_Design_Pattern;

public class OrderClient {

    public static void main(String[] args) {

        FoodItem pizza1 = FoodItemFactory.getFoodItem("PIZZA");
        pizza1.showDetails("ORD-101");

        FoodItem pizza2 = FoodItemFactory.getFoodItem("PIZZA");
        pizza2.showDetails("ORD-102");
    }
}

