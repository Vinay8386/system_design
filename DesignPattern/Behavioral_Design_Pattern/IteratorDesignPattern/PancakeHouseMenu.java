package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;

//Implemented in ArrayList
public class PancakeHouseMenu implements Menu{
    private ArrayList<MenuItem> menuItems; //The menuItems field is marked as private, which means it cannot be accessed directly outside the PancakeHouseMenu class.
    //To check use a public getter method for menuItems.

    public PancakeHouseMenu() {
        menuItems= new ArrayList<>();

        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems; // Exposes internal structure
    }

    //After implementing below, the above getMenuItem() is no more used
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator(); //Returns an iterator over the elements in this list in proper sequence. The returned iterator is fail-fast.
    }
}
