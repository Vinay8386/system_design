package DesignPattern.Structural_Design_Pattern.Flyweight_Design_Pattern;

import java.util.HashMap;
import java.util.Map;

public class FoodItemFactory {

    private static final Map<String, FoodItem> cache = new HashMap<>();

    public static FoodItem getFoodItem(String type){
        if(!cache.containsKey((type))){
            if("PIZZA".equals(type)){
                cache.put(type, new Pizza());
            }
        }
        return cache.get(type);
    }
}
