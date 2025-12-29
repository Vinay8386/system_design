package DesignPattern.Behavioral_Design_Pattern.Iterator_design_Pattern;

import java.util.List;

public class FoodMenuIterator implements Iterator<String> {

    private List<String> items;
    private int index = 0;

    public FoodMenuIterator(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public String next() {
        return items.get(index++);
    }
}

