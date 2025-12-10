package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    @Override
    public MenuItem next() {
        if (!hasNext()) {
            throw new UnsupportedOperationException("No more items");
        }
        return items[position++];
    }

    /*
    //If you want a simpler and more standard approach, use below approach:
    public Iterator<MenuItem> createIterator() {
        List<MenuItem> menuList = Arrays.asList(menuItems);
        return menuList.iterator();
    }
    * */
}
