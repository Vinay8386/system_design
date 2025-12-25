package DesignPattern.Structural_Design_Pattern.Composit_Design_Pattern;

import java.util.*;

public class ComboMeal implements FoodItem{

    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item){
        items.add(item);
    }

    public void removeItem(FoodItem item) {
        items.remove(item);
    }

    @Override
    public double getCost() {
        return items.stream()
                .mapToDouble(FoodItem::getCost)
                .sum();
    }

    @Override
    public void showDetails() {
        items.forEach(FoodItem::showDetails);
    }
}
