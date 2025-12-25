package DesignPattern.Structural_Design_Pattern.Composit_Design_Pattern;

//Client changes only here if menu changes
public class FoodFactory {

    public static FoodItem createItem(String type){

        return switch (type.toUpperCase()){
            case "PIZZA"->new Pizza();
            case "BURGER"-> new Burger();
            case "COMBO"-> {
                ComboMeal combo = new ComboMeal();
                combo.addItem(new Pizza());
                combo.addItem(new Burger());
                yield combo;
            }
            default -> throw new IllegalArgumentException("Invalid food type");
        };

    }
}
