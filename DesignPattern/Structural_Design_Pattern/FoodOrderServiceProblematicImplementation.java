package DesignPattern.Structural_Design_Pattern;

public class FoodOrderServiceProblematicImplementation {

    public double placeOrder(String foodType, boolean extraCheese, boolean giftWrap){
        double price =0;

        if(foodType.equals("PIZZA")){
            price = 200;
        } else if (foodType.equals("BURGER")) {
            price=120;
        }

        if(extraCheese){
            price+=40;
        }

        if (giftWrap) {
            price += 30;
        }

        System.out.println("Order placed. Total price: " + price);
        return price;
    }
}
