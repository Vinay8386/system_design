package DesignPattern.Behavioral_Design_Pattern.Iterator_design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu implements Menu {

    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator<String> createIterator() {
        return new FoodMenuIterator(items);
    }
}

