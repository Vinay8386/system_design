package DesignPattern.Structural_Design_Pattern.Composit_Design_Pattern;

public class OrderFacade {
    public void placeOrder(String foodType){
        FoodItem foodItem = FoodFactory.createItem(foodType);
        System.out.println("Order Details:");
        foodItem.showDetails();
        System.out.println("Total Cost: ₹" + foodItem.getCost());
        System.out.println("Order placed successfully");
    }
}
